package tn.starter.shared.dto;

import lombok.*;

import java.time.LocalDate;

@Builder
public record GenreDto(LocalDate createdAt, LocalDate updatedAt, String title) {}

