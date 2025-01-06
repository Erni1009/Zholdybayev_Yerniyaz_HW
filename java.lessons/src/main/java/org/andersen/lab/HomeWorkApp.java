package org.andersen.lab;

public class HomeWorkApp {
    public static void main(String[] args) {
        printThreeWords();
        checkSumSign();
        printColor();
        compareNumbers();
    }
    public static void printThreeWords() {
        System.out.println("Orange");
        System.out.println("Banana");
        System.out.println("Apple");
    }

    public static void checkSumSign() {
        int a = -55;
        int b = 10;
        int sumCheck = (a + b);
        if (sumCheck >= 0) {
            System.out.println("Sum is positive");
        } else {
            System.out.println("Sum is negative");


        }
    }


    public static void printColor() {
        int value = 55;

        if (value <= 0) {
            System.out.println("Red");
        }
        else if (value > 0 && value <= 100) {
            System.out.println("Yellow");
        }
        else {
            System.out.println("Green");
        }
    }
    public static void compareNumbers() {
        int a = 4;
        int b = 5;
        if (a >= b) {
            System.out.println("a>=b");
        }
        else {
            System.out.println("a<b");
        }
    }
}



