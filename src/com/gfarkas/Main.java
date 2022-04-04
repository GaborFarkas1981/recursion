package com.gfarkas;

public class Main {

    private static final int THOUSAND = 1_000;

    public static void main(String[] args) {

        // 5! = 1 * 2 * 3 * 4 * 5
        Factorial factorial = new Factorial();
        long time = System.nanoTime();
        System.out.println(factorial.getFactorial(20));
        System.out.println("Factorial calculation using recursion: " + (System.nanoTime() - time) / THOUSAND);
        time = System.nanoTime();
        System.out.println(factorial.getFactorialRecursive(20));
        System.out.println("Factorial calculating using a for loop: " + (System.nanoTime() - time) / THOUSAND);

        // 1 1 2 3 5 8 13 21 34
        Fibonacci fibonacci = new Fibonacci();
        time = System.nanoTime();
        System.out.println(fibonacci.getNthFibonacciRecursive(20));
        System.out.println("Nth Fibonacci number calculation using recursion: " + (System.nanoTime() - time) / THOUSAND);
        time = System.nanoTime();
        System.out.println(fibonacci.getNthFibonacciForLoop(20));
        System.out.println("Nth Fibonacci number calculation using a for loop: " + (System.nanoTime() - time) / THOUSAND);
    }
}