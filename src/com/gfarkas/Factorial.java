package com.gfarkas;

public class Factorial {

    public int getFactorial(int val) {
        return factorial(val);
    }

    private int factorial(int val) {
        int result = 1;
        for (int i = 1; i <= val ; i++) {
            result *= i;
        }

        return result;
    }

    private int factorialRecursive(int val) {
        if (val >= 1) {
            return val * factorialRecursive(val - 1);
        } else {
            return 1;
        }
    }

}
