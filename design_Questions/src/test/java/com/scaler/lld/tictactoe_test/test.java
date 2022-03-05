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

        Game game = new Game();

        Board board = new Board(3,3);
        
        game.setBoard(board);

        HumanPlayer human  = new HumanPlayer();
        human.setGameSymbol(GameSymbol.O);
        human.setUser(new User());

        BotPlayer botPlayer = new BotPlayer();
        botPlayer.setGameSymbol(GameSymbol.X);

        game.setPlayers(Arrays.asList(human,botPlayer));
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
