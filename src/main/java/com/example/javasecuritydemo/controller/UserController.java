package com.example.javasecuritydemo.controller;

import com.example.javasecuritydemo.models.User;
import com.example.javasecuritydemo.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/user")
public class UserController {
    private UserService userService;

    @Autowired
    public UserController(UserService userService) {
        this.userService = userService;
    }
    @GetMapping("/get")
    public String get() {
        return "Hello World";
    }
    @PostMapping("/add")
    public String addUser(@RequestBody User user) {
        userService.addUser(user);
        return "User is saved";
    }
}
