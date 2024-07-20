package com.kodilla.version3;

public class Human extends Player {
    public Human (String name) {
        super(name);
    }

    @Override
    public String getCurrentMove() {
        return GameController.getInput();
    }
}
