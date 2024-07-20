package com.kodilla.version3;

import java.util.Random;

public class Computer extends Player {
    public Computer(String name) {
        super(name);

    }

    @Override
    public String getCurrentMove() {
        Random rand = new Random();
        return String.valueOf(rand.nextInt(2) + 1);
    }
}
