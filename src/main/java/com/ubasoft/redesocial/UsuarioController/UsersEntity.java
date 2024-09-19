package com.ubasoft.redesocial.UsuarioController;

import java.time.LocalDateTime;
import java.util.UUID;

import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.validator.constraints.Length;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.validation.constraints.Email;
import lombok.Data;

@Data

@Entity(name = "Usuarios")
public class UsersEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private UUID id;
    private String  nome;

    @Email(message = "Insira um email valido")
    private String email;

    
    @Length(min = 8, max = 100, message = "a senha deve ter de 8 a 100 caractere")
    private String password;


    private String biografia;
    private String foto;

    @CreationTimestamp
    private LocalDateTime data;
    
}
