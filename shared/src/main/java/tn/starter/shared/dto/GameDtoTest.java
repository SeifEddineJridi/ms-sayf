package tn.starter.shared.dto;


import lombok.*;

import java.time.LocalDate;



@NoArgsConstructor
@AllArgsConstructor
@Getter @Setter
public class GameDtoTest {
    private long id, stockId, qte;
    private LocalDate createdAt, updatedAt;
    private String name;
    private GenreDtoTest genreDtoTest;
}
