package ru.example.webapp.domain.dto.ban;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class UnbanUserDto {
    private long userInRoomId;
    private String username;
}
