package com.tdd;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.runners.MockitoJUnitRunner;

import static org.junit.Assert.*;

@RunWith(MockitoJUnitRunner.class)
public class BoardTest {

    @Mock
    BoardStateParser boardStateParser;

    @InjectMocks
    Board board;

    @Test
    public void toStringReturnsInternalState() throws Exception {
        Board board = new Board ("00\n00");

        assertEquals(board.toString(), "00\n00");
    }

    @Test
    public void toStringTotallyReturnsInternalState() throws Exception {
        Board board = new Board ("11\n11");

        assertEquals(board.toString(), "11\n11");

    }

//    @Test
//    public void getNextState() throws Exception {
//        Board nextState = new Board("").getNextState();
//        assertEquals(nextState.getCell());
//
//    }


    @Test
    public void getCellReturnsTheCurrentCellStateDead() throws Exception {

        String state = "0";
        assertEquals(CellState.DEAD, new Board(state).getCell(0,0));


    }
    @Test
    public void getCellReturnsTheCurrentCellStateAlive() throws Exception {

        String state = "1";
        assertEquals(CellState.ALIVE, new Board(state).getCell(0,0));
    }

    @Test
    public void constructorShouldParseBoardState() throws Exception {

        throw new RuntimeException("Start here! We were driving out the constructor of Board via the Game Test (incorrectly).  ");

    }
}