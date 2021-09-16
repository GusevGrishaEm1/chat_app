package ru.example.webapp.domain.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import ru.example.webapp.domain.UserInRoom;
import java.time.LocalDateTime;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class DiscInfoDtoRequest {

    private int minutes;

    private LocalDateTime dateOfDisc;

    private UserInRoom userInRoom;
}
