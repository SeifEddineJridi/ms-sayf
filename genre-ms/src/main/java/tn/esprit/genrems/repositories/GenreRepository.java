package tn.esprit.genrems.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import tn.esprit.genrems.entities.Genre;

public interface GenreRepository extends JpaRepository<Genre, Long> {
}