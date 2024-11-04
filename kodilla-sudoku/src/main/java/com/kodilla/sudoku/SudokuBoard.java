package com.kodilla.sudoku;

import java.util.ArrayList;
import java.util.List;

public class SudokuBoard {
    private final List<SudokuRow> rows;

    public SudokuBoard() {
        this.rows = new ArrayList<>();
        for (int i = 0; i < 9; i++) {
            rows.add(new SudokuRow());
        }
    }

    public SudokuRow getRow(int index) {
        return rows.get(index);
    }

    public void setField(int row, int col, int value) {
        rows.get(row).getElements().get(col).setValue(value);
    }

    public boolean isSolved() {
        for (SudokuRow row : rows) {
            for (SudokuElement element : row.getElements()) {
                if (element.isEmpty()) {
                    return false;
                }
            }
        }
        return true;
    }

    @Override
    public String toString() {
        StringBuilder builder = new StringBuilder();
        for (int row = 0; row < 9; row++) {
            for (int col = 0; col < 9; col++) {
                int value = rows.get(row).getElements().get(col).getValue();
                builder.append(value == SudokuElement.EMPTY ? "." : value);
                if ((col + 1) % 3 == 0 && col < 8) builder.append(" | ");
            }
            builder.append("\n");
            if ((row + 1) % 3 == 0 && row < 8) builder.append("---+---+---\n");
        }
        return builder.toString();
    }
}
