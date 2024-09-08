package com.kodilla;

import java.util.Scanner;
import java.util.Random;

import static java.lang.Boolean.FALSE;
import static java.lang.Boolean.TRUE;

public class Moves {

    int rowNumber;
    int columnNumber;
    int computerRowNumber;
    int computerColumnNumber;
    Random generator = new Random();
    DisplayBoard displayBoard = new DisplayBoard();

    public boolean playerMove(char[][] board, char signType) throws Exception {
        System.out.println(signType + " your turn");
        System.out.println("Please enter a row number ");
        rowNumber = new Scanner(System.in).nextInt();
        System.out.println("Please enter a column number ");
        columnNumber = new Scanner(System.in).nextInt();

        if (GameController.verifyTheCorrectMove(board, rowNumber, columnNumber)) {
            board[rowNumber][columnNumber] = signType;
            displayBoard.displayBoard(board);
        } else {
            return false;
        }
        return true;
    }

    public boolean computerMove(char[][] board, char signType) {
        System.out.println(signType + " your turn");
        boolean validInput = false;
        int size = board.length;
        do {
            computerRowNumber = generator.nextInt(size);
            computerColumnNumber = generator.nextInt(size);

            if (board[computerRowNumber][computerColumnNumber] == 0) {
                board[computerRowNumber][computerColumnNumber] = signType;

                System.out.println("The computer selected field (" + computerRowNumber + ", " + computerColumnNumber + ")");
                displayBoard.displayBoard(board);
                validInput = true;
            }
        }while (!validInput);

        return true;


    }
}
