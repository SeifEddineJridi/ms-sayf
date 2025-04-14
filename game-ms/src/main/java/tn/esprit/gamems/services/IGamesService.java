package tn.esprit.gamems.services;

import tn.esprit.gamems.entities.Game;
import tn.starter.shared.dto.GameDto;
import tn.starter.shared.dto.GameDtoTest;
import tn.starter.shared.generiqueservice.IGenericService;

public interface IGamesService extends IGenericService<GameDtoTest, Game,Long> {
    GameDto getGameById(Long id);
}
