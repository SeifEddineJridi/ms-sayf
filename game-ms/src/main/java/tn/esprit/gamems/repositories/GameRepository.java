package tn.esprit.gamems.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import tn.esprit.gamems.entities.Game;

public interface GameRepository extends JpaRepository<Game, Long> {
}