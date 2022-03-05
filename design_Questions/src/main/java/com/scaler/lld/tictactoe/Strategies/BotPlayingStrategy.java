package com.scaler.lld.tictactoe.Strategies;

import com.scaler.lld.tictactoe.models.Board;
import com.scaler.lld.tictactoe.models.BoardCell;

public interface BotPlayingStrategy {

    public BoardCell play(Board board);
}
