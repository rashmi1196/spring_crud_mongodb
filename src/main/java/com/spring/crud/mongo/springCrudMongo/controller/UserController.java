package com.spring.crud.mongo.springCrudMongo.controller;

import com.spring.crud.mongo.springCrudMongo.model.User;
import com.spring.crud.mongo.springCrudMongo.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/user")
public class UserController {

    @Autowired
    UserService userService;

    @GetMapping("/{userName}")
    public List<User> getUserByName(@PathVariable("userName") String userName){
        return userService.findByName(userName);
    }

    @GetMapping
    public List<User> findAllUsers(){
        return userService.findAllUsers();
    }

    @PostMapping
    public ResponseEntity<?> saveUser(@RequestBody User user){
         userService.saveUser(user);
         return new ResponseEntity<>("User added successfully", HttpStatus.OK);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<?> deleteUserById(@PathVariable("id") String id){
        userService.deleteByUserId(id);
        return new ResponseEntity<>("User deleted successfully", HttpStatus.OK);
    }

}
