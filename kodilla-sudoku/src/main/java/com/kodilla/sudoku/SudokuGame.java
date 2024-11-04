package com.kodilla.sudoku;

import java.util.Scanner;

public class SudokuGame {
    private final SudokuBoard board;
    private final SudokuSolver solver;
    private final Scanner scanner;

    public SudokuGame() {
        this.board = new SudokuBoard();
        this.solver = new SudokuSolver();
        this.scanner = new Scanner(System.in);
    }

    public boolean resolveSudoku() {
        System.out.println("Sudoku Board:");
        System.out.println(board);

        while (true) {
            System.out.println("Enter row, column, and value (e.g., 1,2,3) or type SUDOKU to solve:");
            String input = scanner.nextLine();

            if (input.equalsIgnoreCase("SUDOKU")) {
                if (solver.solve(board)) {
                    System.out.println("Solved Sudoku:");
                    System.out.println(board);
                } else {
                    System.out.println("No solution found for the given Sudoku.");
                }
                break;
            } else {
                try {
                    String[] parts = input.split(",");
                    int row = Integer.parseInt(parts[0]) - 1;
                    int col = Integer.parseInt(parts[1]) - 1;
                    int value = Integer.parseInt(parts[2]);
                    board.setField(row, col, value);
                    System.out.println("Current board:");
                    System.out.println(board);
                } catch (Exception e) {
                    System.out.println("Invalid input. Please try again.");
                }
            }
        }

        System.out.println("Play another game? (yes/no)");
        return scanner.nextLine().equalsIgnoreCase("no");
    }
}
