package com.kodilla.sudoku;

import java.util.HashSet;
import java.util.Set;

public class SudokuElement {
    public static final int EMPTY = -1;
    private int value;
    private Set<Integer> possibleValues;

    public SudokuElement() {
        this.value = EMPTY;
        this.possibleValues = new HashSet<>();
        for (int i = 1; i <= 9; i++) {
            possibleValues.add(i);
        }
    }

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
        possibleValues.clear();
    }

    public Set<Integer> getPossibleValues() {
        return possibleValues;
    }

    public void removePossibleValue(int value) {
        possibleValues.remove(value);
    }

    public boolean isEmpty() {
        return value == EMPTY;
    }
}
