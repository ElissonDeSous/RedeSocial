package com.ubasoft.redesocial.UsuarioController;

import org.hibernate.validator.constraints.UUID;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<UsersEntity, UUID> {
    
}
