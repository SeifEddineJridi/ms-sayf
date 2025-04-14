package tn.esprit.genrems.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.*;
import tn.esprit.genrems.entities.Genre;
import tn.esprit.genrems.services.IGenreService;
import tn.starter.shared.dto.GenreDtoTest;
import tn.starter.shared.generiqueservice.GenericController;

@RestController
@RequestMapping("stock")
public class GenreController extends GenericController<GenreDtoTest, Genre,Long> {

    @Autowired
    IGenreService stockService;

    @Value("${spring.application.name}")
    private String applicationName;

    @GetMapping("welcome")
    public String welcome(){
        return "welcome " + applicationName;
    }




}
