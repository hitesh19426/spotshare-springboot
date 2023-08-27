package com.example.spotshare.mongo.repositories;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.example.spotshare.mongo.documents.User;

public interface UserRepository extends MongoRepository<User, String> {
    
}
