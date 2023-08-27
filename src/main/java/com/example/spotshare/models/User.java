package com.example.spotshare.models;

import java.util.List;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class User {
    private String id;
    
    private String name;
    private String email;
    private String password;
    private String imageUrl;
    private List<Place> places;
}
