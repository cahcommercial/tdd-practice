package com.tdd;

import org.junit.Ignore;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.runners.MockitoJUnitRunner;

import static org.junit.Assert.*;

public class GameTest {

    // Any live cell with fewer than two live neighbours dies, as if caused by underpopulation.
    @Test
    public void anyLiveCellsWithFewerThanTwoNeighborsShouldDie() throws Exception {

        String state = "" +
                "000\n" +
                "010\n" +
                "000";
        Board board = new Board(state);
        Board nextBoard = new Game(board).step();

        assertEquals(CellState.DEAD, nextBoard.getCell(1, 1));


    }

    // Any dead cell with exactly three live neighbours becomes a live cell
    @Test
    public void anyDeadCellWithExactlyThreeLiveNeighborsShouldBecomeAlive() throws Exception {
        String state = "" +
                "010\n" +
                "001\n" +
                "001";
        Board board = new Board(state);
        Board nextBoard = new Game(board).step();

        assertEquals(CellState.ALIVE, nextBoard.getCell(1, 1));



    }
}