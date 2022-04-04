package com.gfarkas;

public class Factorial {

    public long getFactorial(int val) {
        return factorial(val);
    }

    public long getFactorialRecursive(int val) {
        return factorialRecursive(val);
    }

    private long factorial(int val) {
        long result = 1;
        for (int i = 1; i <= val ; i++) {
            result *= i;
        }

        return result;
    }

    private long factorialRecursive(int val) {
        if (val >= 1) {
            return val * factorialRecursive(val - 1);
        } else {
            return 1;
        }
    }

}
