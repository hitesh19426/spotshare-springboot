package com.example.spotshare.mongo.documents;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document
public class Place {
    @Id String id;
    String title;
    String description;
    String address;
    String image;
    Location location;
    String creator;
}
