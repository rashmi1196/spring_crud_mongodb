package com.spring.crud.mongo.springCrudMongo.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Document(collection = "user")
public class user {

    @Id
    private int id;

    private String name;

    private int age;

    private int[] finished;
    private String[] badges;






}
