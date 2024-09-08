package com.kodilla;

public class FiveInRowGameController {
    public static boolean checkRowsFiveInRow(char[][] board, char charType) {
        int size = board.length;

        for (int row = 0; row < size - 1; row++) {
            if (board[row][0] == charType &&
                    board[row][1] == charType &&
                    board[row][2] == charType &&
                    board[row][3] == charType &&
                    board[row][4] == charType &&
                    board[row][5] != charType) {
                return true;
            }
            for (int column = 1; column < size - 5; column++) {
                if (board[row][column] == charType &&
                        board[row][column + 1] == charType &&
                        board[row][column + 2] == charType &&
                        board[row][column + 3] == charType &&
                        board[row][column + 4] == charType &&
                        board[row][column - 1] != charType &&
                        board[row][column + 5] != charType) {
                    return true;
                }
                if (board[row][5] == charType &&
                        board[row][6] == charType &&
                        board[row][7] == charType &&
                        board[row][8] == charType &&
                        board[row][9] == charType &&
                        board[row][4] != charType) {
                    return true;
                }
            }
        }

        return false;
    }

    public static boolean checkColumnsFiveInRow(char[][] board, char charType) {
        int size = board.length;

        for (int column = 0; column < size - 1; column++) {
            if (board[0][column] == charType &&
                    board[1][column] == charType &&
                    board[2][column] == charType &&
                    board[3][column] == charType &&
                    board[4][column] == charType &&
                    board[5][column] != charType) {
                return true;
            }
            for (int row = 1; row < size - 5; row++) {
                if (board[row][column] == charType &&
                        board[row + 1][column] == charType &&
                        board[row + 2][column] == charType &&
                        board[row + 3][column] == charType &&
                        board[row + 4][column] == charType &&
                        board[row - 1][column] != charType &&
                        board[row + 5][column] != charType) {
                    return true;
                }
                if (board[5][column] == charType &&
                        board[6][column] == charType &&
                        board[7][column] == charType &&
                        board[8][column] == charType &&
                        board[9][column] == charType &&
                        board[4][column] != charType) {
                    return true;
                }
            }
        }

        return false;
    }

    public static boolean checkTheDiagonalFromLeftToRightFiveInRow(char[][] board, char charType) {
        int size = board.length;
        for (int row = 0; row < size - 5; row++) {
            if (board[row][0] == charType &&
                    board[row + 1][1] == charType &&
                    board[row + 2][2] == charType &&
                    board[row + 3][3] == charType &&
                    board[row + 4][4] == charType &&
                    board[row + 5][5] != charType) {
                return true;
            }
        }
        for (int column = 1; column < size - 5; column++) {
            if (board[0][column] == charType &&
                    board[1][column + 1] == charType &&
                    board[2][column + 2] == charType &&
                    board[3][column + 3] == charType &&
                    board[4][column + 4] == charType &&
                    board[5][column + 5] != charType) {
                return true;
            }
        }
        for (int row = 1; row < size-5; row++){
            if (board[row][1] == charType &&
                    board[row + 1][2] == charType &&
                    board[row + 2][3] == charType &&
                    board[row + 3][4] == charType &&
                    board[row + 4][5] == charType &&
                    board[row + 5][6] != charType &&
                    board[row - 1][0] != charType){
                return true;
            }
        }
        for (int column = 2; column < size - 5; column++) {
            if (board[1][column] == charType &&
                    board[2][column + 1] == charType &&
                    board[3][column + 2] == charType &&
                    board[4][column + 3] == charType &&
                    board[5][column + 4] == charType &&
                    board[6][column + 5] != charType &&
                    board[0][column - 1] != charType) {
                return true;
            }
        }
        for (int row = 2; row < size-5; row++){
            if (board[row][2] == charType &&
                    board[row + 1][3] == charType &&
                    board[row + 2][4] == charType &&
                    board[row + 3][5] == charType &&
                    board[row + 4][6] == charType &&
                    board[row + 5][7] != charType &&
                    board[row - 1][1] != charType){
                return true;
            }
        }
        for (int column = 3; column < size - 5; column++) {
            if (board[2][column] == charType &&
                    board[3][column + 1] == charType &&
                    board[4][column + 2] == charType &&
                    board[5][column + 3] == charType &&
                    board[6][column + 4] == charType &&
                    board[7][column + 5] != charType &&
                    board[1][column - 1] != charType) {
                return true;
            }
        }
        for (int row = 3; row < size-5; row++){
            if (board[row][3] == charType &&
                    board[row + 1][4] == charType &&
                    board[row + 2][5] == charType &&
                    board[row + 3][6] == charType &&
                    board[row + 4][7] == charType &&
                    board[row + 5][8] != charType &&
                    board[row - 1][2] != charType){
                return true;
            }
        }
        for (int column = 4; column < size - 5; column++) {
            if (board[3][column] == charType &&
                    board[4][column + 1] == charType &&
                    board[5][column + 2] == charType &&
                    board[6][column + 3] == charType &&
                    board[7][column + 4] == charType &&
                    board[8][column + 5] != charType &&
                    board[2][column - 1] != charType) {
                return true;
            }
        }
        for (int row = 4; row < size-5; row++){
            if (board[row][4] == charType &&
                    board[row + 1][5] == charType &&
                    board[row + 2][6] == charType &&
                    board[row + 3][7] == charType &&
                    board[row + 4][8] == charType &&
                    board[row + 5][9] != charType &&
                    board[row - 1][3] != charType){
                return true;
            }
        }

        for (int row = 5; row < size-4; row++){
            if (board[row][0] == charType &&
                    board[row + 1][1] == charType &&
                    board[row + 2][2] == charType &&
                    board[row + 3][3] == charType &&
                    board[row + 4][4] == charType){
                return true;
            }
        }
        for (int column = 5; column < size-4; column++){
            if (board[0][column] == charType &&
                    board[1][column + 1] == charType &&
                    board[2][column + 2] == charType &&
                    board[3][column + 3] == charType &&
                    board[4][column + 4] == charType){
                return true;
            }
        }
        for (int row = 1; row < size-4; row++){
            if (board[row][5] == charType &&
                    board[row + 1][6] == charType &&
                    board[row + 2][7] == charType &&
                    board[row + 3][8] == charType &&
                    board[row + 4][9] == charType &&
                    board[row - 1][4] != charType){
                return true;
            }
        }
        for (int column = 1; column < size-5; column++){
            if (board[5][column] == charType &&
                    board[6][column + 1] == charType &&
                    board[7][column + 2] == charType &&
                    board[8][column + 3] == charType &&
                    board[9][column + 4] == charType &&
                    board[4][column - 1] != charType){
                return true;
            }
        }
        return false;
    }
    public static boolean checkTheDiagonalFromRightToLeftFiveInRow(char[][] board, char charType) {
        int size = board.length;
        for (int row = 0; row < size - 5; row++) {
            if (board[row][size - 1] == charType &&
                    board[row + 1][size - 2] == charType &&
                    board[row + 2][size - 3] == charType &&
                    board[row + 3][size - 4] == charType &&
                    board[row + 4][size - 5] == charType &&
                    board[row + 5][size - 6] != charType) {
                return true;
            }
        }
        for (int column = 5; column < size - 1; column++) {
            if (board[0][column] == charType &&
                    board[1][column - 1] == charType &&
                    board[2][column - 2] == charType &&
                    board[3][column - 3] == charType &&
                    board[4][column - 4] == charType &&
                    board[5][column - 5] != charType) {
                return true;
            }
        }
        for (int row = 1; row < size - 5; row++) {
            if (board[row][size - 2] == charType &&
                    board[row + 1][size - 3] == charType &&
                    board[row + 2][size - 4] == charType &&
                    board[row + 3][size - 5] == charType &&
                    board[row + 4][size - 6] == charType &&
                    board[row + 5][size - 7] != charType &&
                    board[row - 1][size - 1] != charType) {
                return true;
            }
        }
        for (int column = 5; column < size - 2; column++) {
            if (board[1][column] == charType &&
                    board[2][column - 1] == charType &&
                    board[3][column - 2] == charType &&
                    board[4][column - 3] == charType &&
                    board[5][column - 4] == charType &&
                    board[6][column - 5] != charType &&
                    board[0][column + 1] != charType) {
                return true;
            }
        }
        for (int row = 2; row < size - 5; row++) {
            if (board[row][size - 3] == charType &&
                    board[row + 1][size - 4] == charType &&
                    board[row + 2][size - 5] == charType &&
                    board[row + 3][size - 6] == charType &&
                    board[row + 4][size - 7] == charType &&
                    board[row + 5][size - 8] != charType &&
                    board[row - 1][size - 2] != charType) {
                return true;
            }
        }
        for (int column = 5; column < size - 3; column++) {
            if (board[2][column] == charType &&
                    board[3][column - 1] == charType &&
                    board[4][column - 2] == charType &&
                    board[5][column - 3] == charType &&
                    board[6][column - 4] == charType &&
                    board[7][column - 5] != charType &&
                    board[1][column + 1] != charType) {
                return true;
            }
        }
        for (int row = 3; row < size - 5; row++) {
            if (board[row][size - 4] == charType &&
                    board[row + 1][size - 5] == charType &&
                    board[row + 2][size - 6] == charType &&
                    board[row + 3][size - 7] == charType &&
                    board[row + 4][size - 8] == charType &&
                    board[row + 5][size - 9] != charType &&
                    board[row - 1][size - 3] != charType) {
                return true;
            }
        }
        for (int column = 5; column < size - 4; column++) {
            if (board[3][column] == charType &&
                    board[4][column - 1] == charType &&
                    board[5][column - 2] == charType &&
                    board[6][column - 3] == charType &&
                    board[7][column - 4] == charType &&
                    board[8][column - 5] != charType &&
                    board[2][column + 1] != charType) {
                return true;
            }
        }
        for (int row = 4; row < size-5; row++){
            if (board[row][size - 5] == charType &&
                    board[row + 1][size - 6] == charType &&
                    board[row + 2][size - 7] == charType &&
                    board[row + 3][size - 8] == charType &&
                    board[row + 4][size - 9] == charType &&
                    board[row + 5][size - 10] != charType &&
                    board[row - 1][size - 4] != charType){
                return true;
            }
        }
        for (int row = 0; row < size-9; row++){
            if (board[row][size-6] == charType &&
                    board[row + 1][size-7] == charType &&
                    board[row + 2][size-8] == charType &&
                    board[row + 3][size-9] == charType &&
                    board[row + 4][size-10] == charType){
                return true;
            }
        }
        for (int column = 9; column < size; column++){
            if (board[5][column] == charType &&
                    board[6][column - 1] == charType &&
                    board[7][column - 2] == charType &&
                    board[8][column - 3] == charType &&
                    board[9][column - 4] == charType){
                return true;
            }
        }
        for (int row = 1; row < size-4; row++){
            if (board[row][4] == charType &&
                    board[row + 1][3] == charType &&
                    board[row + 2][2] == charType &&
                    board[row + 3][1] == charType &&
                    board[row + 4][0] == charType &&
                    board[row - 1][5] != charType){
                return true;
            }
        }
        for (int column = 5; column < size-1; column++){
            if (board[5][column] == charType &&
                    board[6][column - 1] == charType &&
                    board[7][column - 2] == charType &&
                    board[8][column - 3] == charType &&
                    board[9][column - 4] == charType &&
                    board[4][column + 1] != charType){
                return true;
            }
        }

        return false;
    }



    public static boolean verifyTie(char[][] board, int moveCounter) {

        int size = board.length;
        if (moveCounter >= size * size && !checkRowsFiveInRow(board, 'X') && !checkRowsFiveInRow(board, 'O') &&
                !checkColumnsFiveInRow(board, 'X') && !checkColumnsFiveInRow(board, 'O')) {
            return true;
        }
        return false;
    }


    public static boolean verifyTheResult(int moveCounter, char playerSign, char computerSign, char[][] board) {
        if (checkRowsFiveInRow(board, playerSign) || checkColumnsFiveInRow(board, playerSign) ||
                checkTheDiagonalFromLeftToRightFiveInRow(board, playerSign) ||
                checkTheDiagonalFromRightToLeftFiveInRow(board, playerSign)) {
            System.out.println("Congratulations! The winner is " + playerSign);
            return true;
        } else if (checkRowsFiveInRow(board, computerSign) || checkColumnsFiveInRow(board, computerSign) ||
                checkTheDiagonalFromLeftToRightFiveInRow(board, computerSign) ||
                checkTheDiagonalFromRightToLeftFiveInRow(board, computerSign)) {
            System.out.println("You lost! The winner is " + computerSign);
            return true;
        } else if (verifyTie(board, moveCounter)) {
            System.out.println("There is a tie.");
            return true;
        }
        return false;


    }
}
