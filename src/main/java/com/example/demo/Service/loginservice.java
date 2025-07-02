
package com.telusko.demo.service;

import com.example.demo.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class loginservice {

    PasswordEncoder encoder =new BCryptPasswordEncoder(10);

    @Autowired
    private userrepo repo;

    public User register(User user) {
        user.setPassword(encoder.encode(user.getPassword()));
        return repo.save(user);

    }
}
