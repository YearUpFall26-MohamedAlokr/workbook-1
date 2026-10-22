package com.pluralsight;

public class MathApp {
    public static void main(String[] args) {

        // Question 1: Highest Salary
        double bobSalary = 65000.00;
        double garySalary = 72000.00;
        double highestSalary = Math.max(bobSalary, garySalary);
        System.out.println("The highest salary is $" + highestSalary);

        // Question 2: Lowest Vehicle Price
        double carPrice = 25000.00;
        double truckPrice = 35000.00;
        double lowestPrice = Math.min(carPrice, truckPrice);
        System.out.println("The lowest vehicle price is $" + lowestPrice);

        // Question 3: Area of a Circle
        double radius = 7.25;
        double area = Math.PI * Math.pow(radius, 2);
        System.out.println("The area of the circle is " + area);

        // Question 4: Square Root
        double number = 5.0;
        double squareRoot = Math.sqrt(number);
        System.out.println("The square root of " + number + " is " + squareRoot);

        // Question 5: Distance Between Two Points
        double x1 = 5;
        double y1 = 10;
        double x2 = 85;
        double y2 = 50;

        double distance = Math.sqrt(Math.pow(x2 - x1, 2)+ Math.pow(y2 - y1, 2));
        System.out.println("The distance between the points is " + distance);

        // Question 6: Absolute Value
        double negativeNumber = -3.8;
        double absoluteValue = Math.abs(negativeNumber);
        System.out.println("The absolute value of " + negativeNumber + " is " + absoluteValue);

        // Question 7: Random Number
        double randomNumber = Math.random();
        System.out.println("A random number between 0 and 1 is " + randomNumber);

        // Question 8: Minutes in 24 Days
        int days = 24;
        int hoursPerDay = 24;
        int minutesPerHour = 60;
        int totalMinutes = days * hoursPerDay * minutesPerHour;

        System.out.println("There are " + totalMinutes + " minutes in 24 days.");

        // Bonus: Milliseconds in 24 Days
        int sec = 60;
        int milSec = 1000;

        long totMilSec= (long) days * hoursPerDay * minutesPerHour
                * sec * milSec;

        System.out.println("There are " + totMilSec + " milliseconds in 24 days.");
    }
}