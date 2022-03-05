package com.scaler.lld.tictactoe_test;

import static org.junit.Assert.assertEquals;

import java.util.Arrays;
import java.util.List;

import com.scaler.lld.tictactoe.models.Board;
import com.scaler.lld.tictactoe.models.BoardCell;
import com.scaler.lld.tictactoe.models.BotPlayer;
import com.scaler.lld.tictactoe.models.Game;
import com.scaler.lld.tictactoe.models.GameSymbol;
import com.scaler.lld.tictactoe.models.HumanPlayer;
import com.scaler.lld.tictactoe.models.User;

import lombok.Setter;
import lombok.Getter;
import org.junit.Before;
import org.junit.Test;

public class test {

    private  Game game;

    @Before
    public void setUp(){
        this.game = createGame();
    }

    private Game createGame(){

        // HumanPlayer human  = new HumanPlayer();
        // human.setGameSymbol(GameSymbol.O);
        // human.setUser(new User());

        // BotPlayer botPlayer = new BotPlayer();
        // botPlayer.setGameSymbol(GameSymbol.X);
        Game game = Game.getBuilder()
                        .withDimensionsBuilder(3, 3)
                        .withPlayeBuilder(
                            HumanPlayer.builder()
                                .gameSymbol(GameSymbol.O)
                                    .user(User.builder()
                                        .email("email nahi bataunga")
                                        .username("username")
                                        .build())
                            .build())
                        .withPlayeBuilder(
                            BotPlayer.builder().
                            gameSymbol(GameSymbol.X).
                            build())
                        .build();

        return game;

    }

    @Test
    public void testDimension(){
        List<List<BoardCell>> cells = game.getBoard().getCells();
        assertEquals("if the board size is equal to number of cells",3, cells.size());

        List<BoardCell> firstRow = cells.get(0);
        assertEquals("if the board size is equal to number of cells",3, firstRow.size());

    } 
    
}
