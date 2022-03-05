package com.scaler.lld.tictactoe.models;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class HumanPlayer extends Player{
    
    private User user;

    @Override
    public BoardCell makeMove(Board board) {
        return null;
    }
}
