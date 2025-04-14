package tn.esprit.gamems.aspect;

import lombok.RequiredArgsConstructor;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.stereotype.Component;
import org.springframework.util.Assert;
import tn.esprit.gamems.feignClients.IGenreServicesFeignClient;
import tn.starter.shared.dto.GenreDto;
import tn.starter.shared.dto.GenreDtoTest;
import tn.starter.shared.dto.GameDtoTest;

@Aspect
@Component
@RequiredArgsConstructor
public class CustomInterceptor {

    private final IGenreServicesFeignClient genreServicesFeignClient;

    @Around("execution(public Object tn.starter.shared.generiqueservice.*.*(..))")
    public Object mapGenreWithDto(ProceedingJoinPoint pjp ) throws Throwable {
        Object o = pjp.proceed();

        Assert.isInstanceOf(GameDtoTest.class,o);
        GameDtoTest dto = (GameDtoTest) o;
        if(dto.getGenreDtoTest().getId()!= 0) {
            GenreDtoTest genreDto = dto.getGenreDtoTest();
            dto.setGenreDtoTest(genreDto);
        }
        return dto;
    }
}
