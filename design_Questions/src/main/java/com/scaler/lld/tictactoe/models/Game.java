package com.scaler.lld.tictactoe.models;

import java.util.ArrayList;
import java.util.List;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Game {
    private Board board;
    List<Player> players = new ArrayList<>();
}