package com.scaler.lld.tictactoe.models;

import lombok.Getter;
import lombok.Setter;
import lombok.experimental.SuperBuilder;

@Getter
@Setter
@SuperBuilder(toBuilder = true)
public abstract class Player {
    
    private GameSymbol gameSymbol;
    
    public abstract BoardCell makeMove(Board board);
}
