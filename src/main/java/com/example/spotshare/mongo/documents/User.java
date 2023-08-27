package com.example.spotshare.mongo.documents;

import java.util.List;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document
public class User {
    @Id String id;
    String name;
    String email;
    String password;
    String imageUrl;
    List<Place> places;
}
