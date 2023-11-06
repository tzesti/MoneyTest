package org.example;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");

        // A floating point data types have accuracy issues as demonstrated by following code.
        // We will implement Money class to better represent a currency value.

        double dollar = 1.00;
        double dime = 0.10;
        int number = 7;
        System.out.println(
                "A dollar less " + number + " dimes is $" + (dollar - number * dime)
        );
    }
}