package com.kodilla.version2;

import java.util.Scanner;

import static com.kodilla.version2.RPSRunner.*;

public class GameController {

    private static Scanner scanner = new Scanner(System.in);

    public static String getInput(){
        return String.valueOf(scanner.nextLine());
    }

    public static String rpsInputParser(String input){
        Scanner scanner = new Scanner(System.in);
        return switch (input) {
            case "1" -> "rock";
            case "2" -> "paper";
            case "3" -> "scissors";
            default -> "";
        };
    }

    public static void showMenu(){
        System.out.println("""
                        ----Menu----
                        n - new game
                        x - end game
                        r - resume game
                        s - statistics
                        h - help
                        """);
    }

    public static void showPossibilities(){
        System.out.println("""
                1.rock
                2.paper
                3.scissors
                m - show menu""");

    }

    public static void showStats(){
        System.out.println("----Statistic----");
        if (player1 == null){
            System.out.println("Nothing to show");
        } else {
            System.out.println(player1.getName() + " " + player1.getPointsInRound()
                    + " - " + player2.getName() + " " + player2.getPointsInRound());
        }
    }

    public static void confirmNewGame(){
        System.out.println("""
                Confirm new game:
                y - yes
                n - cancel
                """);
    }

    public static void confirmExit(){
        System.out.println("""
                Confirm end of game
                y - yes
                n - cancel
                """);
    }

    public static boolean choice() {
        String input = getInput();

        if (input.equals("y")){
            return true;
        } else if (input.equals("n")){
            return false;
        }
        else return false;
    }

    public static void finishGame(){
        System.out.println("Game was finished after " + (currentRound) +  " rounds");
        System.out.println(player1.getName() + " " + player1.getPointsInRound() + " - " +
                player2.getPointsInRound() + " " + player2.getName());
    }
}
