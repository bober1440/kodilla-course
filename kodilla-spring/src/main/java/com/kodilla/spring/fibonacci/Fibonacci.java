package com.kodilla.spring.fibonacci;

public class Fibonacci {
    int sum;
    int a = 0;
    int b = 1;

    public int Fibonacci(int n) {
        for (int i = 0; i <= n-2; i++) {
            sum = a + b;
            a = b;
            b = sum;
        }
        return sum;
    }
}
