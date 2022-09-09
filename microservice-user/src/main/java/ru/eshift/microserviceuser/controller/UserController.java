package ru.eshift.microserviceuser.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import ru.eshift.microserviceuser.model.User;

@RestController
@RequestMapping("/api/v1/user")
public class UserController {

    @GetMapping
    public User getUser(){
        return new User("Vasya","Pupkin");
    }

}
