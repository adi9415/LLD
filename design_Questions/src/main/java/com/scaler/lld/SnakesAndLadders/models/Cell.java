package com.scaler.lld.SnakesAndLadders.models;

import java.util.ArrayList;
import java.util.List;

import lombok.Getter;
import lombok.Setter;
import lombok.experimental.SuperBuilder;

@Getter
@Setter
@SuperBuilder(toBuilder = true)
public abstract class Cell {

    private Integer index;
    private CellType type;
    private List<Piece> pices = new ArrayList<>();

    public abstract Integer getNextPosition();
    
    
}
