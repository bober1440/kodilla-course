package com.kodilla.version1;

import java.util.Random;
import java.util.Scanner;

public class RockPaperScissorsStructural {
    public static void main(String[] args) {
        System.out.println("Hi, this is a basic, structural version of Rock, Paper, Scissors game");
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter your name: ");

        while (true) {
            String[] rps = {"Rock", "Paper", "Scissors"};
            String computerMove = rps[new Random().nextInt(rps.length)];

            Scanner scanner2 = new Scanner(System.in);
            String name = scanner2.nextLine();
            String playerMove;

            while (true) {
                System.out.println("Please enter your move: Rock, Paper or Scissors: ");
                playerMove = scanner.nextLine();
                if (playerMove.equals("Rock") || playerMove.equals("Paper") || playerMove.equals("Scissors")) {
                    break;
                }
                System.out.println(playerMove + " is not allowed");
            }

            System.out.println("Computer move: " + computerMove);
            if (playerMove.equals(computerMove)) {
                System.out.println("TIE !");
            } else if (playerMove.equals("Rock")) {
                if (computerMove.equals("Paper")) {
                    System.out.println("You lose !");
                } else if (computerMove.equals("Scissors")) {
                    System.out.println("You win !");
                }
            } else if (playerMove.equals("Paper")) {
                if (computerMove.equals("Scissors")) {
                    System.out.println("You lose !");
                } else if (computerMove.equals("Rock")) {
                    System.out.println("You win !");
                }
            } else if (playerMove.equals("Scissors")) {
                if (computerMove.equals("Paper")) {
                    System.out.println("You win !");
                } else if (computerMove.equals("Rock")) {
                    System.out.println("You lose !");
                }
            }
            System.out.println("Do you want to play again? (Y/N)");
            String playAgain = scanner.nextLine();
            if (!playAgain.equals("Y")) {
                System.out.println("Thanks for playing!");
                break;
            }
        }
    }
}
