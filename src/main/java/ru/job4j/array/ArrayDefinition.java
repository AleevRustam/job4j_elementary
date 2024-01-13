package ru.job4j.array;

public class ArrayDefinition {
    public static void main(String[] args) {

        String[] surnames = new String[4];
        surnames[0] = "Surname0";
        surnames[1] = "Surname1";
        surnames[2] = "Surname2";
        surnames[3] = "Surname3";

        for (String surname : surnames) {
            System.out.println(surname);
        }

    }
}
