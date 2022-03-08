package com.scaler.lld.SnakesAndLadders.Commands;

import java.util.HashSet;
import java.util.Set;

public class CommandRegistry {

    private Set<Command> commands = new HashSet<>();

    public void register(Command command)
    {
        commands.add(command);
    }

    public void deregister(Command command)
    {
        commands.remove(command);
    }

    public void execute(String incoming)
    {
        for(Command command : commands)
        {
            if(command.match(incoming))
            {
                command.execute(incoming);
                return;
            }
        }

        throw new RuntimeException("Invalid Command"+incoming);
    }
    
}
