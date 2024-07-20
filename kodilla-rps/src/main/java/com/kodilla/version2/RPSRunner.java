package com.kodilla.version2;

import static com.kodilla.version2.GameController.*;
import static com.kodilla.version2.GameRules.setNumberOfRounds;
import static com.kodilla.version2.GameRules.whoWins;

public class RPSRunner {
    protected static Human player1;
    protected static Computer player2;
    protected static int currentRound;

    public void startGame() {
        currentRound = 0;

        System.out.println("Enter your name");
        player1 = new Human(getInput());
        player2 = new Computer("Computer");

        System.out.println("How many rounds do you want to play?");
        setNumberOfRounds(Integer.parseInt(getInput()));

        showPossibilities();
        processGame();
    }

    public void processGame() {

        while (GameRules.getNumberOfRounds() > currentRound) {
            System.out.println("Your turn");
            String p1move = player1.getCurrentMove();

            if (p1move.equals("m")) {
                enterMenu();
            } else {
                currentRound++;

                System.out.println(rpsInputParser(p1move));
                System.out.println("Computer's turn");
                String p2move = player2.getCurrentMove();
                System.out.println(rpsInputParser(p2move));
                System.out.println("-----");

                whoWins(p1move, p2move);
            }
        }
        finishGame();
    }

    public void enterMenu() {
        showMenu();
        String input = getInput();

        switch (input) {
            case "n" -> {
                confirmNewGame();
                if (choice()) {
                    startGame();
                } else {
                    enterMenu();
                }
            }
            case "x" -> endGame();
            case "r" -> {
                if (player1 == null) {
                    System.out.println("No game to resume!");
                    enterMenu();
                } else {
                    processGame();
                }
            }
            case "s" -> {
                showStats();
                enterMenu();
            }
            case "h" -> {
                showPossibilities();
                enterMenu();
            }
            default -> enterMenu();
        }
    }

        public void endGame () {
            confirmExit();
            if (choice()) {
                System.exit(0);
            } else {
                enterMenu();
            }
        }
    }
