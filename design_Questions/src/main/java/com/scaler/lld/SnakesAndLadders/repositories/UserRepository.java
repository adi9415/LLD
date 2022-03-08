package com.scaler.lld.SnakesAndLadders.repositories;

import java.util.ArrayList;
import java.util.List;

import com.scaler.lld.SnakesAndLadders.models.User;

public class UserRepository {

    List<User> userRepo  = new ArrayList<>();

    public User save(User user)
    {
        userRepo.add(user);
        return user;
    }
    
}
