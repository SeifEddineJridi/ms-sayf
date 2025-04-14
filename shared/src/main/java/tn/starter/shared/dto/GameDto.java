package tn.starter.shared.dto;


import lombok.*;

import java.time.LocalDate;


@Builder
public record GameDto(LocalDate createdAt, LocalDate updatedAt, String name, GenreDto genreDto){
}
