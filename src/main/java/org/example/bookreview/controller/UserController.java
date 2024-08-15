package org.example.bookreview.controller;

import org.example.bookreview.model.User;
import org.example.bookreview.repository.UserRepository;
import org.example.bookreview.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController()
public class UserController {
@Autowired
    private UserService userService;
@GetMapping("/users")
    public List<User> returnAllUsers(){
        return userService.getAllUsers();
    }



}
