package com.ubasoft.redesocial.UsuarioController;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import jakarta.validation.Valid;

@RestController

@RequestMapping("/createusers")
public class UsersControllr {
    
    @Autowired
    private UserRepository RepositorioUsuario;

    @PostMapping("/")

    public UsersEntity CreateUsers(@Valid @RequestBody UsersEntity CriarUsers){
        return this.RepositorioUsuario.save(CriarUsers);
    }


    
   



   


}
