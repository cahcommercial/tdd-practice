package com.tdd;

import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;


public class BoardStateParserTest {

    @Test
    public void parseTakesAStringAndReturnsA2DimensionalArrayRepresentingBoard() throws Exception {

        String state =
                "000\n" +
                "010\n" +
                "010";
        CellState[][] actual = new BoardStateParser().parse(state);
        assertThat(actual).containsSequence(createExpectedBoardState());
    }

    private CellState[][] createExpectedBoardState() {
        CellState[][] expected = new CellState[3][3];
        expected[0][0] = CellState.DEAD;
        expected[0][1] = CellState.DEAD;
        expected[0][2] = CellState.DEAD;
        expected[1][0] = CellState.DEAD;
        expected[1][1] = CellState.ALIVE;
        expected[1][2] = CellState.DEAD;
        expected[2][0] = CellState.DEAD;
        expected[2][1] = CellState.ALIVE;
        expected[2][2] = CellState.DEAD;
        return expected;
    }
}