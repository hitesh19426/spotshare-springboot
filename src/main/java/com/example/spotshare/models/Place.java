package com.example.spotshare.models;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@Builder
@NoArgsConstructor
public class Place {
    private String id;
    private String title;
    private String description;
    private String address;
    private String image;
    private Location location;
    private String creator;
}
