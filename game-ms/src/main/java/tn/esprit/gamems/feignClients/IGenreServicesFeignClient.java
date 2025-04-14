package tn.esprit.gamems.feignClients;

import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.context.annotation.Bean;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import tn.starter.shared.dto.GenreDto;

@EnableFeignClients
@FeignClient(name="genre",url = "GENRE-MS")

public interface IGenreServicesFeignClient {

    @GetMapping("/genre/{id}")
    GenreDto getGenreById(@PathVariable Long id);
}
