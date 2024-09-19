package com.ubasoft.redesocial.Posts;

import org.hibernate.validator.constraints.UUID;

import org.springframework.data.jpa.repository.JpaRepository;

public interface PostsRepository extends JpaRepository<ProdutosEntity, UUID> {
    
}
