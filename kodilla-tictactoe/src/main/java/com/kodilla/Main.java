package com.kodilla;

import java.util.Objects;

public class Main {
    public static void main(String[] args) throws Exception {
        boolean flag = false;
        do {
            try {
                int counter = 0;
                int counter5 = 0;
                DisplayBoard displayBoard = new DisplayBoard();
                Player player = new Player();
                Moves moves = new Moves();
                String gameType = player.askTypeOfGame();
                char playerSign = player.askPlayerSign();
                char computerSign = player.computerSign();

                if (Objects.equals(gameType, "Classic")) {
                    char[][] classicBoard = new char[3][3];
                    displayBoard.displayBoard(classicBoard);
                    do {
                        counter++;
                        counter++;
                        if (moves.playerMove(classicBoard, playerSign)) {
                            if (GameController.verifyTheResult(counter, playerSign, computerSign, classicBoard))
                                break;
                            else if (moves.computerMove(classicBoard, computerSign)) {
                                if (GameController.verifyTheResult(counter, playerSign, computerSign, classicBoard))
                                    break;
                            }
                        }
                    } while (true);
                } else if (Objects.equals(gameType, "FiveInARow")) {
                    char[][] fiveInARowBoard = new char[10][10];
                    displayBoard.displayBoard(fiveInARowBoard);
                    do {
                        counter5++;
                        counter5++;
                        if (moves.playerMove(fiveInARowBoard, playerSign)) {
                            if (FiveInRowGameController.verifyTheResult(counter5, playerSign, computerSign, fiveInARowBoard)) {
                                break;
                            } else if (moves.computerMove(fiveInARowBoard, computerSign)) {
                                if (FiveInRowGameController.verifyTheResult(counter5, playerSign, computerSign, fiveInARowBoard)) {
                                    break;
                                }
                            }
                        }
                    } while (true);
                }

            } catch (MoveOnTakenPlaceException exception) {
                System.out.println("This field is taken. Please start a new game.");
                flag = true;
            } catch (MoveOffTheBoardException exception) {
                System.out.println("You put a sign off the board. Please start a new game.");
                flag = true;
            } catch (IncorrectInputException exception) {
                System.out.println("Incorrect input.");
                flag = true;
            }catch (Exception exception) {
                System.out.println("Error");
                flag = true;
            }
        } while (flag);
    }
}