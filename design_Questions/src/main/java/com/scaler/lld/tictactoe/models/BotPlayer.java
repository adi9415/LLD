package com.scaler.lld.tictactoe.models;

import com.scaler.lld.tictactoe.Strategies.BotPlayingStrategy;

public class BotPlayer extends Player{

    private BotPlayingStrategy botPlayingStrategy;
    
    @Override
    public BoardCell makeMove(Board board) {
        return botPlayingStrategy.play(board);
    }
    
}
