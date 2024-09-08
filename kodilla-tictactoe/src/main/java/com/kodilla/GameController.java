package com.kodilla;

public class GameController {

    public static boolean checkTheDiagonalFromLeftToRight(char[][] board, char charType) {
        int size = board.length;
        for (int i = 0; i < size; i++) {
            if (board[i][i] != charType) {
                return false;
            }
        }
        return true;
    }

    public static boolean checkTheDiagonalFromRightToLeft(char[][] board, char charType) {
        int size = board.length;
        for (int i = 0; i < size; i++) {
            if (board[i][size - i - 1] != charType) {
                return false;
            }
        }
        return true;
    }

    public static boolean checkColumns(char[][] board, char charType) {
        int size = board.length;
        for (int column = 0; column < size; column++) {
            boolean win = true;
            for (char[] chars : board) {
                if (chars[column] != charType) {
                    win = false;
                    break;
                }
            }
            if (win) {
                return true;
            }
        }
        return false;
    }

    public static boolean checkRows(char[][] board, char charType) {
        int size = board.length;
        for (char[] chars : board) {
            boolean win = true;
            for (int column = 0; column < size; column++) {
                if (chars[column] != charType) {
                    win = false;
                    break;
                }
            }
            if (win) {
                return true;
            }
        }
        return false;
    }

    public static boolean verifyTie(char[][] board, int moveCounter) {

        int size = board.length;
        if (moveCounter >= size*size && !checkRows(board, 'X') && !checkRows(board, 'O') &&
                !checkColumns(board, 'X') && !checkColumns(board, 'O') &&
                !checkTheDiagonalFromLeftToRight(board, 'X') && !checkTheDiagonalFromLeftToRight(board, 'O') &&
                !checkTheDiagonalFromRightToLeft(board, 'X') && !checkTheDiagonalFromRightToLeft(board, 'O')){
            return true;
        }
        return false;
    }

    public static boolean verifyTheCorrectMove(char[][] board, int row, int column) throws Exception {
        if(row < board.length && column < board.length){
            if (!(board[row][column] == 0))
                throw new MoveOnTakenPlaceException();
        } else {
            throw new MoveOffTheBoardException();
        }
        return true;
    }

    public static boolean verifyTheResult(int moveCounter, char playerSign, char computerSign, char[][] board) {
        if (checkRows(board, playerSign) || checkColumns(board, playerSign) ||
                checkTheDiagonalFromLeftToRight(board, playerSign) || checkTheDiagonalFromRightToLeft(board, playerSign)) {
            System.out.println("Congratulations! The winner is " + playerSign);
            return true;
        } else if (checkRows(board, computerSign) || checkColumns(board, computerSign) ||
                checkTheDiagonalFromLeftToRight(board, computerSign) || checkTheDiagonalFromRightToLeft(board, computerSign)) {
            System.out.println("You lost! The winner is " + computerSign);
            return true;
        } else if (verifyTie(board, moveCounter)) {
            System.out.println("There is a tie.");
            return true;
        }
        return false;
    }

}