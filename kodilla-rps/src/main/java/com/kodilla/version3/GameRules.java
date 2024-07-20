package com.kodilla.version3;

import static com.kodilla.version3.RPSRunner.player1;
import static com.kodilla.version3.RPSRunner.player2;

public class GameRules {

    final static private int[][] rules = {
            { 0,-1, 1,-1, 1},
            { 1, 0,-1, 1,-1},
            {-1, 1, 0,-1, 1},
            { 1,-1, 1, 0,-1},
            {-1, 1,-1, 1, 0}

    };

    private static int numberOfRounds;

    public static void whoWins(String player1Move, String computerMove) {
        int score = rules[Integer.parseInt(player1Move) -1][Integer.parseInt(computerMove) - 1];
        if (score == 1) {
            player1.addPoints();
            System.out.println("Point for " + player1.getName());
        } else if (score == -1) {
            player2.addPoints();
            System.out.println("Point for " + player2.getName());
        } else {
            System.out.println("TIE!");
            System.out.println("No points added");
        }
        System.out.println();
    }

    public static void setNumberOfRounds(int x) {
        numberOfRounds = x;
    }

    public static int getNumberOfRounds() {
        return numberOfRounds;
    }
}

