package com.scaler.lld.SnakesAndLadders.controllers;

import com.scaler.lld.SnakesAndLadders.models.User;
import com.scaler.lld.SnakesAndLadders.services.UserService;

public class UserController {
    
    UserService userService = new UserService();
    public User createUser(Integer id, String email, String name)
    {
        return userService.createUser(id,email,name);
    }
}
