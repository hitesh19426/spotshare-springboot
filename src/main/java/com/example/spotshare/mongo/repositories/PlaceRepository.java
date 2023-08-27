package com.example.spotshare.mongo.repositories;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.example.spotshare.mongo.documents.Place;

public interface PlaceRepository extends MongoRepository<Place, String> {
    
}
