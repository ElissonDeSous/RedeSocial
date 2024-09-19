package com.ubasoft.redesocial.Posts;

import java.time.LocalDateTime;
import java.util.UUID;

import org.hibernate.annotations.CreationTimestamp;


import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Data;


@Data

@Entity(name = "produto")
public class ProdutosEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private UUID id;


    private String title;
    private String description;
    private double price;

    @CreationTimestamp
    private LocalDateTime dataPost;
}
