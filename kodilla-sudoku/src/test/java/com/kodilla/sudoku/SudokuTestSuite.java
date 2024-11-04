package com.kodilla.sudoku;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SudokuElementTest {

    @Test
    void testSetAndGetValue() {
        SudokuElement element = new SudokuElement();
        element.setValue(5);
        assertEquals(5, element.getValue());
    }

    @Test
    void testIsEmpty() {
        SudokuElement element = new SudokuElement();
        assertTrue(element.isEmpty());

        element.setValue(5);
        assertFalse(element.isEmpty());
    }

    @Test
    void testPossibleValues() {
        SudokuElement element = new SudokuElement();
        assertTrue(element.getPossibleValues().contains(5));

        element.removePossibleValue(5);
        assertFalse(element.getPossibleValues().contains(5));
    }

    @Test
    void testEmptyBoardInitialization() {
        SudokuBoard board = new SudokuBoard();

        for (int row = 0; row < 9; row++) {
            for (int col = 0; col < 9; col++) {
                assertEquals(SudokuElement.EMPTY, board.getRow(row).getElements().get(col).getValue());
            }
        }
    }

    @Test
    void testSetField() {
        SudokuBoard board = new SudokuBoard();
        board.setField(0, 0, 5);
        assertEquals(5, board.getRow(0).getElements().get(0).getValue());
    }

    @Test
    void testToString() {
        SudokuBoard board = new SudokuBoard();
        board.setField(0, 0, 5);
        String boardStr = board.toString();
        assertTrue(boardStr.contains("5"));
        assertTrue(boardStr.contains("."));
    }

    @Test
    void testIsSolvedForEmptyBoard() {
        SudokuBoard board = new SudokuBoard();
        assertFalse(board.isSolved());
    }

    @Test
    void testIsSolvedForCompleteBoard() {
        SudokuBoard board = new SudokuBoard();
        for (int row = 0; row < 9; row++) {
            for (int col = 0; col < 9; col++) {
                board.setField(row, col, (col + row * 3) % 9 + 1);  // Wypełnianie losowymi wartościami
            }
        }
        assertTrue(board.isSolved());
    }

    @Test
    void testSolveSimpleSudoku() {
        SudokuBoard board = new SudokuBoard();
        board.setField(0, 0, 5);
        board.setField(0, 1, 3);
        board.setField(1, 0, 6);
        board.setField(4, 4, 7);
        board.setField(8, 8, 9);

        SudokuSolver solver = new SudokuSolver();
        assertTrue(solver.solve(board));
        assertTrue(board.isSolved());
    }

    @Test
    void testSolveEmptySudoku() {
        SudokuBoard board = new SudokuBoard();
        SudokuSolver solver = new SudokuSolver();

        assertTrue(solver.solve(board));
        assertTrue(board.isSolved());
    }

    @Test
    void testSolveUnsolvableSudoku() {
        SudokuBoard board = new SudokuBoard();
        board.setField(0, 0, 1);
        board.setField(0, 1, 1);  // Conflict - cannot solve

        SudokuSolver solver = new SudokuSolver();
        assertFalse(solver.solve(board));
    }

    @Test
    void testIsSafeMethod() {
        SudokuBoard board = new SudokuBoard();
        SudokuSolver solver = new SudokuSolver();

        board.setField(0, 0, 5);
        assertFalse(solver.isSafe(board, 0, 1, 5));
        assertTrue(solver.isSafe(board, 0, 1, 4));
    }
}
