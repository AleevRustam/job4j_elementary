package ru.job4j;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world");
        divWithoutRemainder(100);
    }

    public static void divWithoutRemainder(int num) {
        int dig1 = num / 100;
        int dig2 = (num % 100) / 10;
        int dig3 = num % 10;

        if (num % dig1 == 0) {
            System.out.print(dig1);
        }
        if (dig2 != 0) {
            if (num % dig2 == 0) {
                System.out.print(" " + dig2);
            }
        } else {
            System.out.println("\n");
        }
        if (dig3 != 0) {
            if (num % dig3 == 0) {
                System.out.println(" " + dig3);
            }
        } else {
            System.out.println("\n");
        }

        if (num % dig1 != 0 && num % dig2 != 0 && num % dig3 != 0) {
            System.out.println("Таких чисел нет");
        }
    }
}