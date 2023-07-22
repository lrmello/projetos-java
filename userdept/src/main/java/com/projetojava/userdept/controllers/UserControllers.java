package com.projetojava.userdept.controllers;

import com.projetojava.userdept.entities.User;
import com.projetojava.userdept.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value = "/users")
public class UserControllers {

    @Autowired
    private UserRepository repository;

    @GetMapping
    public List<User> findAll(){
      List<User> result =  repository.findAll();
      return result;
    }

    @GetMapping(value = "/{id}")
    public User findById(@PathVariable Long id){
        User result =  repository.findById(id).get();
        return result;
    }


    @PostMapping(value = "/{id}")
    public User insert(@RequestBody User user){
        User result =  repository.save(user);
        return result;
    }
}