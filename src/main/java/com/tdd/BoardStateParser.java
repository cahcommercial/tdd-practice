package com.tdd;

public class BoardStateParser {

    public CellState[][] parse(String state) {
        String[] splitState = state.split("\n");
        CellState[][] retVal = new CellState[splitState.length][splitState[0].length()];
        for (int rowIndex = 0; rowIndex< splitState.length; rowIndex++) {
            retVal[rowIndex] = extractCellsFromRow(splitState[rowIndex]);
        }
        return retVal;
    }

    private CellState[] extractCellsFromRow(String row) {
        CellState[] retVal = new CellState[row.length()];
        for (int colIndex = 0; colIndex < row.length(); colIndex++) {
            retVal[colIndex] = extractCellStateFromCharacter(row, colIndex);
        }
        return retVal;
    }

    private CellState extractCellStateFromCharacter(String row, int colIndex) {
        char c = row.charAt(colIndex);
        return c == '0' ? CellState.DEAD : CellState.ALIVE;
    }
}
