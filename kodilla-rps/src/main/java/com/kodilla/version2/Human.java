package com.kodilla.version2;

public class Human extends Player {
    public Human (String name) {
        super(name);
    }

    @Override
    public String getCurrentMove() {
        return GameController.getInput();
    }
}
