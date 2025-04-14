package tn.esprit.gamems.controllers;

import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.*;
import tn.esprit.gamems.entities.Game;
import tn.esprit.gamems.services.IGamesService;
import tn.starter.shared.dto.GameDto;
import tn.starter.shared.dto.GameDtoTest;
import tn.starter.shared.generiqueservice.GenericController;

@RestController
@RefreshScope
@RequestMapping("games")
@RequiredArgsConstructor
public class GamesController extends GenericController<GameDtoTest, Game,Long> {

    private final IGamesService gamesService;

    @Value("${spring.app.value}")
    private String value;

    @Value("${spring.application.name}")
    private String applicationName;

    @GetMapping("welcome")
    public String welcome(){
        return "welcome " + applicationName;
    }



//    @PatchMapping("patch/{id}")
//    public Product patchUpdate(@RequestBody Map<Object,Object> fields, @PathVariable long id){
//        return productService.patchUpdate(fields,id);
//    }

    @GetMapping("getGameById/{id}")
    public GameDto getGameById(@PathVariable long id){
        return gamesService.getGameById(id);
    }

}
