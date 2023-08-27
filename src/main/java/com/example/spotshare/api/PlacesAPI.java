package com.example.spotshare.api;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.spotshare.models.Place;

@RestController
@RequestMapping("/api/places")
public class PlacesAPI {
    
    @PostMapping(value = "/")
    public Place createPlace(@RequestBody Place place){
        return null;
    }

    @GetMapping(value = "")
    public List<Place> getPlacesByUserId(){
        return new ArrayList<>();
    }

    @GetMapping(value = "/")
    public Place getPlaceById(@RequestParam(value = "id") String placeId){
        return null;
    }

    @PatchMapping(value = "/")
    public Place updatePlaceById(@RequestParam String placeId, @RequestBody Place updatedPlace){
        return null;
    }

    @DeleteMapping(value = "/")
    public Place deletePlaceById(@RequestParam String placeId){
        return null;
    }

}
