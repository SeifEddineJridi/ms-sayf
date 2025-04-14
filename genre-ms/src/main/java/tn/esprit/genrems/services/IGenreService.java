package tn.esprit.genrems.services;
import tn.esprit.genrems.entities.Genre;
import tn.starter.shared.dto.GenreDtoTest;
import tn.starter.shared.generiqueservice.IGenericService;

public interface IGenreService extends IGenericService<GenreDtoTest, Genre,Long> {
}
