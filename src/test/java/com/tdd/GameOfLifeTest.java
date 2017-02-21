package com.tdd;

import org.junit.Ignore;
import org.junit.Test;

import static org.junit.Assert.*;


public class GameOfLifeTest {

    private String state =
            "00000\n" +
            "00000\n" +
            "01110\n" +
            "00000\n" +
            "00000";

    private String state2 =
            "00000\n" +
            "00100\n" +
            "00100\n" +
            "00100\n" +
            "00000";

    private Board initialState = new Board(state);

    @Ignore
    @Test
    public void oscillatingBlinkerTest() throws Exception {
        Game game = new Game(initialState);

        Board nextState = game.step();

        assertEquals(nextState, new Board(state2));
    }

    @Test
    public void aliveCellWithFewerThan2NeighborsDies() throws Exception {
        Board fewerThan2 = new Board(
                "000\n" +
                "010\n" +
                "000");

        Game game = new Game(fewerThan2);

        Board nextState = game.step();

        assertEquals(nextState.toString(),
                "000\n" +
                "000\n" +
                "000");
    }

}