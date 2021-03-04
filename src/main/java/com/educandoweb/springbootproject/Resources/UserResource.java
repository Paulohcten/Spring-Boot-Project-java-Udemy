package com.educandoweb.springbootproject.Resources;

import com.educandoweb.springbootproject.Entities.User;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/Users")
public class UserResource {

    @GetMapping
    public ResponseEntity<User> findAll(){
        User user = new User(1L,"Jack Black","jack@gmail.com","999999999","12345");
        return ResponseEntity.ok().body(user);
    }
}
