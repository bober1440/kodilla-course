package com.kodilla.sudoku;

public class SudokuSolver {

    public boolean solve(SudokuBoard board) {
        for (int row = 0; row < 9; row++) {
            for (int col = 0; col < 9; col++) {
                SudokuElement element = board.getRow(row).getElements().get(col);
                if (element.isEmpty()) {
                    for (int number = 1; number <= 9; number++) {
                        if (isSafe(board, row, col, number)) {
                            element.setValue(number);
                            if (solve(board)) {
                                return true;
                            }
                            element.setValue(SudokuElement.EMPTY);
                        }
                    }
                    return false;
                }
            }
        }
        return true;
    }

    boolean isSafe(SudokuBoard board, int row, int col, int number) {

        for (int i = 0; i < 9; i++) {
            if (board.getRow(row).getElements().get(i).getValue() == number) {
                return false;
            }
        }


        for (int i = 0; i < 9; i++) {
            if (board.getRow(i).getElements().get(col).getValue() == number) {
                return false;
            }
        }


        int startRow = (row / 3) * 3;
        int startCol = (col / 3) * 3;
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if (board.getRow(startRow + i).getElements().get(startCol + j).getValue() == number) {
                    return false;
                }
            }
        }

        return true;
    }
}
