package tn.esprit.gamems.feignClients;

import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.autoconfigure.security.SecurityProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.web.client.RestTemplate;
import tn.starter.shared.dto.GenreDto;
import tn.starter.shared.dto.GenreDtoTest;

import java.util.List;



public class GenreServicesFeignClient implements IGenreServicesFeignClient{

    RestTemplate restTemplate = new RestTemplate();

    @Value("param.baseurl")
    private String baseURL ;

    public GenreDtoTest get(long id) {

        return null;
    }

    @Override
    public GenreDto getGenreById(Long id) {
        return null;
    }
}
