package ru.example.webapp.domain;

import lombok.Data;
import org.hibernate.validator.constraints.Length;
import org.springframework.lang.Nullable;
import javax.persistence.*;
import javax.validation.constraints.NotBlank;
import java.util.ArrayList;
import java.util.List;

@Data
@Entity
@Table(name="usr")
public class User {

    @Id
    @GeneratedValue
    @Column(name = "id")
    private long id;

    @NotBlank(message = "Please, fill the username")
    @Length(max = 64, message = "username is too long" )
    @Column(name = "username", unique = true, nullable = false)
    private String username;

    @NotBlank(message = "Please, fill the password")
    @Length(max = 64, message = "password is too long" )
    @Column(name = "password", nullable = false)
    private String password;

    @Column(name = "banned")
    private boolean banned;

    @Column(name = "role", nullable = false)
    private Role role;

}
