package com.kodilla.version3;

public class RPSRunner {
    protected static Human player1;
    protected static Computer player2;
    protected static int currentRound;

    public void startGame() {
        currentRound = 0;

        System.out.println("Enter your name");
        player1 = new Human(GameController.getInput());
        player2 = new Computer("Computer");

        System.out.println("How many rounds do you want to play?");
        GameRules.setNumberOfRounds(Integer.parseInt(GameController.getInput()));

        GameController.showPossibilities();
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

                System.out.println(GameController.rpsInputParser(p1move));
                System.out.println("Computer's turn");
                String p2move = player2.getCurrentMove();
                System.out.println(GameController.rpsInputParser(p2move));
                System.out.println("-----");

                GameRules.whoWins(p1move, p2move);
            }
        }
        GameController.finishGame();
    }

    public void enterMenu() {
        GameController.showMenu();
        String input = GameController.getInput();

        switch (input) {
            case "n" -> {
                GameController.confirmNewGame();
                if (GameController.choice()) {
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
                GameController.showStats();
                enterMenu();
            }
            case "h" -> {
                GameController.showPossibilities();
                enterMenu();
            }
            default -> enterMenu();
        }
    }

        public void endGame () {
            GameController.confirmExit();
            if (GameController.choice()) {
                System.exit(0);
            } else {
                enterMenu();
            }
        }
    }
