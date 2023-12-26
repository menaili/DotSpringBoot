package com.example.demo.api.controller;

import java.util.List;


import com.example.demo.Repository.UserRepository;
import com.example.demo.api.model.User;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/users")
public class UserController {
    
    private final UserRepository userRepository;

    public UserController(UserRepository userRepository){
        this.userRepository = userRepository;
    }

    @GetMapping()
    public List<User> getUser(){
        return userRepository.findAll();
    }

    @PostMapping
    public User addUser(@RequestBody User user) {
            System.out.println("Received user: " + user);

            return userRepository.save(user);
    }


    @GetMapping("/{id}")
    public User getUserById(@PathVariable int id) {
        return userRepository.findById(id).orElse(null);
    }

    @PutMapping("/{id}")
    public User updateUser(@PathVariable int id, @RequestBody User updateUser) {
        if (userRepository.existsById(id)) {
            updateUser.setId(id);
            return userRepository.save(updateUser);
        }
        return null;
    }

    @DeleteMapping("/{id}")
    public void deleteUser(@PathVariable int id) {
        userRepository.deleteById(id);
    }
}
