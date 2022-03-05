package com.scaler.lld.tictactoe.models;

import com.scaler.lld.tictactoe.Strategies.BotPlayingStrategy;

import lombok.Getter;
import lombok.Setter;
import lombok.experimental.SuperBuilder;

@Getter
@Setter
@SuperBuilder(toBuilder = true)
public class BotPlayer extends Player{

    private BotPlayingStrategy botPlayingStrategy;
    
    @Override
    public BoardCell makeMove(Board board) {
        return botPlayingStrategy.play(board);
    }
    
}
