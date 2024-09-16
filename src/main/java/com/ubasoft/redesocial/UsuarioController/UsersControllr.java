package com.ubasoft.redesocial.UsuarioController;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import jakarta.validation.Valid;

@RestController

@RequestMapping("/createusers")
public class UsersControllr {
    

    @PostMapping("/")

    public String CreateUsers(@Valid @RequestBody UsersEntity CriarUsers){
        return CriarUsers.getNome() + "\n" + CriarUsers.getEmail();
    }
}
