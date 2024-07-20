package com.kodilla.version2;
public abstract class Player {
    private String name;
    private int roundsWon = 0;
    private int pointsInRound;

    public Player(String name) {
        this.name = name;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public int getRoundsWon() {
        return roundsWon;
    }
    public void setRoundsWon(int roundsWon) {
        this.roundsWon = roundsWon;
    }
    public int getPointsInRound() {
        return pointsInRound;
    }

    public void addPoints (){
        this.pointsInRound++;
    }

    public abstract String getCurrentMove();
}
