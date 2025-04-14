package tn.esprit.genrems.services;


import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;
import tn.esprit.genrems.entities.Genre;
import tn.starter.shared.dto.GenreDtoTest;
import tn.starter.shared.generiqueservice.IGenericServiceImp;


@Slf4j
@Service
@RequiredArgsConstructor
public class IGenreServiceIpm extends IGenericServiceImp<GenreDtoTest, Genre,Long> implements IGenreService {


}
