package com.scaler.lld.SnakesAndLadders.models;

import java.util.ArrayList;
import java.util.List;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;


@Getter
@Setter
@Builder(toBuilder = true)
public class Game {

    private Board board;

    @Builder.Default 
    List<Player> players = new ArrayList<>();
    
    @Builder.Default
    List<Dice> dices = new ArrayList<>();
    
}
