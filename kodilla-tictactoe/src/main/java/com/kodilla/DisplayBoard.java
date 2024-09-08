package com.kodilla;

public class DisplayBoard {
    public void displayBoard(char[][] board) {
        int size = board.length;
        System.out.print("\t");

        for (int i = 0; i < size; i++) {
            System.out.print(i + ":" + "\t");
        }
        System.out.println();

        for (int row = 0; row < size; row++) {
            System.out.print(row + ":\t");
            for (int column = 0; column < size; column++) {
                System.out.print(board[row][column] + "\t");

            }
            System.out.println();
        }
    }
}