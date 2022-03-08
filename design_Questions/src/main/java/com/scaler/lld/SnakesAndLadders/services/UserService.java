package com.scaler.lld.SnakesAndLadders.services;

import com.scaler.lld.SnakesAndLadders.models.User;
import com.scaler.lld.SnakesAndLadders.repositories.UserRepository;

public class UserService {

    UserRepository userRepository = new UserRepository();
    public User createUser(Integer id, String name, String email)
    {
        User user = User.builder().email(email).id(id).name(name).build();
        userRepository.save(user);
        return user;

    }
    
}
