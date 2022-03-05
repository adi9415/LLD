package com.scaler.lld.tictactoe.models;

import java.lang.module.ModuleDescriptor.Builder;
import java.util.ArrayList;
import java.util.List;

import javax.management.RuntimeErrorException;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Game {
    private Board board;
    List<Player> players = new ArrayList<>();


    public static Builder getBuilder()
    {
        return new Builder();
    }


    public static class Builder{

        private Game game;

        Builder()
        {
            this.game = new Game();
        }

        public Builder withDimensionsBuilder(int row, int col)
        {
            Board board = new Board(row, col);
            this.game.setBoard(board);
            return this;
        }

        public Builder withPlayeBuilder(Player player)
        {
            this.game.getPlayers().add(player);
            return this;
        }

        public Game build(){
            int curr = this.game.getPlayers().size();
            if(curr>2)
                throw new RuntimeException();
            return this.game;
        }
    }
}