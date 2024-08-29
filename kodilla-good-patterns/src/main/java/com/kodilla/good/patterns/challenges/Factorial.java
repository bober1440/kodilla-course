package com.kodilla.good.patterns.challenges;

public class Factorial {

        public static int factorial(int n) throws IllegalArgumentException {
            if (n <= 0){
                throw new IllegalArgumentException();
        }

            int factorial = 1;

            for (int i = 1; i < n ; i++) {
                factorial = factorial * i;
            }
            return factorial;
        }
    }

