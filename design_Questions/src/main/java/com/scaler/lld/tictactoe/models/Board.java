package com.scaler.lld.tictactoe.models;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import lombok.Getter;
import lombok.Setter;


@Getter
@Setter
public class Board {
    List<List<BoardCell>> cells = new ArrayList<>();

    public Board(int row, int cols)
    {
        List<BoardCell> columns = Collections.nCopies(cols, new BoardCell());
        this.cells = Collections.nCopies(row, columns);

    }
    
}
