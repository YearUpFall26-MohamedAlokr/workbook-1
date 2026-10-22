package com.pluralsight;

public class VariableApp {
    public static void main(String[] args) {
//        1. Declare a variable to store your favorite color
//        2. Declare a variable to store the year you started this class
//        3. Declare a variable to store your middle initial
//        4. Declare a variable to store whether you have pets (yes/no)
//        5. Declare a variable with a nice message or saying
//
        String color= "blue";
        int year =2026;
        char middleName='S';
        boolean hasPets = true;
        String message = "Hello World!";
        System.out.println("My favorite color is " + color );
        System.out.println("I started this class in " + year);
        System.out.println("My middle initial is " + middleName );
        System.out.println("I have pets: " + hasPets );
        System.out.println("Message: " + message);


//        Step 2
//        Declare AND initialize variables for:
//        1. The number of days in a week
//        2. The price of coffee ($4.99)
//        3. Your favorite letter
//        4. Whether it's raining (true/false)
//        5. Print all values in complete sentences

        int daysInWeek = 7;
        double coffeePrice = 4.99;
        char favoriteLetter = 'M';
        boolean isRaining = false;

        System.out.println("There are " + daysInWeek + " days in a week");
        System.out.println("A coffee costs " + coffeePrice + "$");
        System.out.println("My favorite letter is " + favoriteLetter);
        System.out.println("Is it raining? " + isRaining);


    }
}