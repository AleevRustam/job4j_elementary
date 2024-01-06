package ru.job4j.calculator;

import static ru.job4j.math.MathFunction.*;

public class MathCalculator {
    public static double sumAndMultiply(double first, double second) {
        return sum(first, second)
                + multiply(first, second);
    }

    public static double sumSubtractDivision(double first, double second) {
        return sum(first, second)
                - division(first, second);
    }

    public static double sumAllMathOperation(double first, double second) {
        return sum(first, second)
                + subtract(first, second)
                + division(first, second)
                + multiply(first, second);
    }

    public static void main(String[] args) {
        System.out.println("Результат расчета равен: " + sumAndMultiply(10, 20));
        System.out.println("Результат расчета равен: " + sumSubtractDivision(10, 20));
        System.out.println("Результат расчета равен: " + sumAllMathOperation(10, 20));
    }
}
