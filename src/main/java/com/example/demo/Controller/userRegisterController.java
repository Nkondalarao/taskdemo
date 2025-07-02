package com.example.demo.Controller;


import com.example.demo.Service.loginservice;
import com.example.demo.model.User;
import com.telusko.demo.service.loginservice;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api")
@CrossOrigin(origins = "http://localhost:3000")
public class userRegisterController
{
    @Autowired
    private loginservice loginservice;

    @PostMapping("/register")
    public User adduser(@RequestBody User user){

        return loginservice.register(user);
    }



}