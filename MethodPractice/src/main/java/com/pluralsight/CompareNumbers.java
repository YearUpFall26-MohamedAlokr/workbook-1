package com.pluralsight;

public class CompareNumbers {
    static void main() {
        System.out.println(isEven(3));
        System.out.println(isPositive(-1));
        System.out.println(isEven(2));
        System.out.println(isPositive(1));
    }
    public static boolean isEven(int number) {
        return number % 2 == 0;
    }

    public static boolean isPositive(double number) {
        return number > 0;
    }
}
