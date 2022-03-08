package com.scaler.lld.tictactoe.models.factories;

import com.scaler.lld.tictactoe.models.HumanPlayer;

public class PlayerFactory {

    public static HumanPlayer.HumanPlayerBuilder getHumanPlayerBuilder(){
        return HumanPlayer.builder();
    }
    
}
