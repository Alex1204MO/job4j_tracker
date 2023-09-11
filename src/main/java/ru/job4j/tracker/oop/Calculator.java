package ru.job4j.tracker.oop;

public class Calculator {
    private static int x = 5;

    public static int sum(int y) {
        return x + y;
    }

    public static int minus(int y) {
        return y - x;
    }

    public int multiply(int y) {
        return y * x;
    }

    public int divide(int y) {
        return y / x;
    }

    public int sumAllOperation(int y) {
        return sum(y) + multiply(y) + minus(y) + divide(y);
    }

    public static void main(String[] args) {
        int y = 10;
        Calculator calculator = new Calculator();

        int sum = sum(y);
        int minus = minus(y);
        int multiply = calculator.multiply(y);
        int divide = calculator.divide(y);
        int sumAllOperation = calculator.sumAllOperation(y);
        String sum1 = "summ: %d; multiply: %d; minus: %d; divide: %d; sumAll: %d";
        System.out.printf(sum1, sum, multiply, minus, divide, sumAllOperation);
    }
}
