package com.example.spotshare.api;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.spotshare.models.User;

@RestController
@RequestMapping("/api/users")
public class UsersAPI {
    
    @GetMapping(value = "")
    public List<User> getListOfUsers(){
        return new ArrayList<>();
    }

}
