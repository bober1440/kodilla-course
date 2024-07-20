package com.kodilla.version2;

import static com.kodilla.version2.RPSRunner.player1;
import static com.kodilla.version2.RPSRunner.player2;

public class GameRules {

    final static private int[][] rules = {
            {0, 1, 1},
            {1, 0, -1},
            {-1, 0, 1},
    };

    private static int numberOfRounds;

    public static void whoWins(String player1Move, String computerMove) {
        int score = rules[Integer.parseInt(player1Move)][Integer.parseInt(computerMove) - 1];
        if (score == 1) {
            player1.addPoints();
            System.out.println("Point for " + player1.getName());
        } else if (score == -1) {
            player2.addPoints();
        } else {
            System.out.println("TIE!");
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

