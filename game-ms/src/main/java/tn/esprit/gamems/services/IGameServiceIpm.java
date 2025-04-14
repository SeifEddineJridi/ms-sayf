package tn.esprit.gamems.services;


import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;
import tn.esprit.gamems.entities.Game;
import tn.esprit.gamems.feignClients.IGenreServicesFeignClient;
import tn.esprit.gamems.repositories.GameRepository;
import tn.starter.shared.dto.GameDto;
import tn.starter.shared.dto.GameDtoTest;
import tn.starter.shared.generiqueservice.IGenericServiceImp;

@Slf4j
@Service
@RequiredArgsConstructor
public class IGameServiceIpm extends IGenericServiceImp<GameDtoTest, Game,Long>  implements IGamesService{

    private final GameRepository gameRepository;
    private final IGenreServicesFeignClient iGenreServicesFeignClient;




    /*@Override
    @Transactional
    public Product patchUpdate(Map<Object, Object> fields, long id) {

        Product product = productRepository.findById(id).orElse(null);
        Assert.notNull(product,"product not found with this id: "+id);

        fields.forEach((key, value) -> {
            Field field = ReflectionUtils.findField(Product.class, (String) key);
            field.setAccessible(true);

            log.info(key + " " +field.getType()+"  "+value);

            if(field.getType().equals(LocalDate.class)){
                DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-mm-d");
                LocalDate localDate = LocalDate.parse((String) value, formatter);
                ReflectionUtils.setField(field, product , localDate);
            }else {
                ReflectionUtils.setField(field, product , value);
            }



        });

        return product;
    }*/

    @Override
    public GameDto getGameById(Long id) {

        Game game = gameRepository.findById(id).orElse(null);

        GameDto gameDto = GameDto.builder()
                .name(game.getGame())
                .genreDto(iGenreServicesFeignClient.getGenreById(game.getGenreId()))
                .build();

        return gameDto;
    }
}
