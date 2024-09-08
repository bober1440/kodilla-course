package com.kodilla;

import java.util.Scanner;

public class Player {
    Scanner scanner = new Scanner(System.in);
    private char playerSign;
    private String gameType;

    public char askPlayerSign() {
        System.out.println("Please choose player sign (\"X\" or \"O\") ");
        char playerChoice = scanner.next().charAt(0);

        if (playerChoice == 'X' || playerChoice == 'O') {
            playerSign = playerChoice;
            System.out.println("You chose " + playerSign);
        } else if (playerChoice == 'x') {
            playerSign = 'X';
            System.out.println("You chose " + playerSign);
        } else if (playerChoice == 'o') {
            playerSign = 'O';
            System.out.println("You chose " + playerSign);
        } else {
            System.out.println("Incorrect sign.");
            askPlayerSign();
        }

        return playerSign;
    }

    public char computerSign() {

        char computerSign = playerSign == 'X' ? 'O' : 'X';
        return computerSign;
    }

    public String askTypeOfGame() throws Exception {
        System.out.println("What kind of game do you choose?\n" +
                "\t- Classic tic tac toe game - PRESS \"1\"\n" +
                "\t- Five in a Row game - PRESS \"2\"");

        int playerChoice = scanner.nextInt();

        if (playerChoice == 1) {
            gameType = "Classic";
            System.out.println("You chose classic tic tac toe game");
        } else if (playerChoice == 2) {
            gameType = "FiveInARow";
            System.out.println("You chose Five in a Row game");
        } else {
            throw new IncorrectInputException();
        }
        return gameType;
    }
}