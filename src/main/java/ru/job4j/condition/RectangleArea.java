package ru.job4j.condition;

public class RectangleArea {
    public static double square(double p, double k) {
        double h = p / (2 * (k + 1));
        double l = h * k;
        double result = l * h;
        return result;
    }

    public static void main(String[] args) {
        double result = RectangleArea.square(6, 2);
        System.out.println(" s = " + result);
        double result1 = RectangleArea.square(12, 3);
        System.out.println(" s = " + result1);
        double result2 = RectangleArea.square(15, 5);
        System.out.println(" s = " + result2);
    }
}
