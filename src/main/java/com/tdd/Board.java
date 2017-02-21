package com.tdd;

/**
 * Created by jimmy.balmert on 2/7/17.
 */
public class Board {
    private String state;
    private CellState[][] board;

    public Board(String state) {

        this.state = state;

        board = new CellState[3][3];
        for (int row = 0; row < 2; row++) {
            for (int col = 0; col < 2; col++) {
                board[row][col] = CellState.DEAD;
            }
        }
        board[0][0] = state.charAt(0) == '0' ? CellState.DEAD : CellState.ALIVE;
    }



    @Override
    public String toString() {
        return state;
    }

    public CellState getCell(int row, int col) {
        return board[row][col];
    }

    public Board getNextState() {
            return null;
    }
}
