package com.kodilla.stream.array;

import java.util.stream.IntStream;

public interface ArrayOperations {
    static double getAverage (int[] numbers) {
        IntStream.range(0, numbers.length)
                .forEach(n -> System.out.println(numbers[n]));

        return IntStream.range(0, numbers.length)
                .mapToDouble(i -> numbers[i])
                .average()
                .orElse(0);

    }

    static double getMax(int[] numbers) {
        IntStream.range(0, numbers.length)
                .forEach(n -> System.out.println(numbers[n]));

        return IntStream.range(0, numbers.length)
                .mapToDouble(i -> numbers[i])
                .max()
                .orElse(0);

    }

    static double getMin(int[] numbers) {
        IntStream.range(0, numbers.length)
                .forEach(n -> System.out.println(numbers[n]));

        return IntStream.range(0, numbers.length)
                .mapToDouble(i -> numbers[i])
                .min()
                .orElse(0);
    }
}
