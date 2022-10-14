package com.spring.crud.mongo.springCrudMongo.service;

import com.spring.crud.mongo.springCrudMongo.model.User;
import org.springframework.stereotype.Service;

import java.util.List;

public interface UserService {

    List<User> findByName(String name);

    void deleteByUserId(String id);

    User saveUser(User user);

    List<User> findAllUsers();


    List<User> findByIdAndName(String id, String name);
}
