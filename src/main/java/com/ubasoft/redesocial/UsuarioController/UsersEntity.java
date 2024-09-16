package com.ubasoft.redesocial.UsuarioController;

import java.util.UUID;

import org.hibernate.validator.constraints.Length;

import jakarta.validation.constraints.Email;
import lombok.Data;

@Data
public class UsersEntity {
    private UUID id;
    private String  nome;

    @Email(message = "Insira um email valido")
    private String email;

    
    @Length(min = 8, max = 100, message = "a senha deve ter de 8 a 100 caractere")
    private String password;


    private String biografia;
    private String foto;
    
}
