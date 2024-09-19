package com.ubasoft.redesocial.Posts;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping("/produtos")
public class PostsController {
     @Autowired
   private PostsRepository Posts;

   @PostMapping("/")
   public ProdutosEntity CriarPosts(@RequestBody ProdutosEntity posts){
      return this.Posts.save(posts);
   }
}
