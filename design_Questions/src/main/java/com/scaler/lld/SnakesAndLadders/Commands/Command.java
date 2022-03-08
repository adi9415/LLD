package com.scaler.lld.SnakesAndLadders.Commands;

public interface Command {

    public boolean match(String command);

    public void execute(String command);
    
}
