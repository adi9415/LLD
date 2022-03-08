package com.scaler.lld.SnakesAndLadders.Commands;

import java.util.Arrays;
import java.util.List;

import com.scaler.lld.SnakesAndLadders.controllers.UserController;
import com.scaler.lld.SnakesAndLadders.models.User;

public class CreateUserCommand implements Command {

    private String COMMAND_NAME = "create_user";
    private UserController userController  = new UserController();

    @Override
    public boolean match(String command) {
        List<String> tokens = Arrays.asList(command.split(" "));
        if(tokens.size() > 0 &&  tokens.get(0).equals(COMMAND_NAME))
        {
            return true;
        }
        return false;
        
    }

    @Override
    public void execute(String command) {

        List<String> tokens = Arrays.asList(command.split(" "));

        String username = tokens.get(1);
        String email = tokens.get(2);
        int id = generateID();

        User user = userController.createUser(id, email, username);
        System.out.println("user created with name " + user);
        
    }

    private int generateID(){
        return (int)(Math.random()) + 1;
    }
    
}
