package com.scaler.lld.SnakesAndLadders;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import com.scaler.lld.SnakesAndLadders.Commands.CommandRegistry;
import com.scaler.lld.SnakesAndLadders.Commands.CreateUserCommand;

public class Client {

    public static void main(String[] args) {
        
        CommandRegistry commandRegistry = createCommandRegistry();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        while(true){
            System.out.println(">>");
            
            try {
                String input = br.readLine().toString();
                commandRegistry.execute(input);                    
            } catch (IOException e) {
                System.out.println("Error reading file");
            }
        }
    }

    private static CommandRegistry createCommandRegistry(){
        CommandRegistry commandRegistry = new CommandRegistry();
        commandRegistry.register(new CreateUserCommand());
        return commandRegistry;
    }
    
}
