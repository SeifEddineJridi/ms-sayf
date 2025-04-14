package tn.esprit.gamems.entities;

import jakarta.persistence.Entity;
import lombok.*;
import lombok.experimental.FieldDefaults;
import tn.starter.shared.entities.BaseEntity;

@Entity
@Getter @Setter @ToString
@AllArgsConstructor
@NoArgsConstructor
@FieldDefaults(level = AccessLevel.PRIVATE)
public class Game extends BaseEntity {

    String game;
    long year;

    long genreId;

}
