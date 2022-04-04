package com.gfarkas;

public class Fibonacci {



    public int getNthFibonacciRecursive(int nThFibonacciNumber) {
        return fibonacciRecursive(nThFibonacciNumber);
    }

    public int getNthFibonacciForLoop(int nThFibonacciNumber) {
        return fibonacciRecursive(nThFibonacciNumber);
    }

    private int fibonacciForLoop(int nThFibonacciNumber) {
        if (nThFibonacciNumber < 3) {
            return 1;
        }

        int secondLastFibonacci = 1;
        int lastFibonacci = 1;
        int fibonacci = 1;
        for (int i = 3; i <= nThFibonacciNumber ; i++) {
            fibonacci = secondLastFibonacci + lastFibonacci;
            secondLastFibonacci = lastFibonacci;
            lastFibonacci = fibonacci;
        }

        return fibonacci;
    }

    private int fibonacciRecursive(int nThFibonacciNumber) {

        if (nThFibonacciNumber > 2) {
            return fibonacciRecursive(nThFibonacciNumber - 1) + fibonacciRecursive(nThFibonacciNumber - 2);
        } else {
            return 1;
        }


    }

}
