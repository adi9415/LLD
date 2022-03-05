package com.scaler.lld.tictactoe.models;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public abstract class Player {
    
    private GameSymbol gameSymbol;
    
    public abstract BoardCell makeMove(Board board);
}
