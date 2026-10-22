package com.pluralsight;

import java.util.Scanner;

public class RentalCarCalculator {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Pickup date: ");
        String pickupDate = scanner.nextLine();

        System.out.print("Number of rental days: ");
        int days = scanner.nextInt();
        scanner.nextLine();

        System.out.print("Electronic toll tag (yes/no): ");
        String tollTag = scanner.nextLine();

        System.out.print("GPS (yes/no): ");
        String gps = scanner.nextLine();

        System.out.print("Roadside assistance (yes/no): ");
        String roadside = scanner.nextLine();

        System.out.print("Driver age: ");
        int age = scanner.nextInt();

        double basicRental = days * 29.99;
        double optionsCost = 0.0;

        if (tollTag.equalsIgnoreCase("yes")) {
            optionsCost += days * 3.95;
        }

        if (gps.equalsIgnoreCase("yes")) {
            optionsCost += days * 2.95;
        }

        if (roadside.equalsIgnoreCase("yes")) {
            optionsCost += days * 3.95;
        }

        double underageSurcharge = 0.0;

        if (age < 25) {
            underageSurcharge = basicRental * 0.30;
        }

        double totalCost = basicRental + optionsCost + underageSurcharge;

        System.out.println("Rental Summary");
        System.out.printf("Basic Rental: $%.2f%n", basicRental);
        System.out.printf("Options Cost: $%.2f%n", optionsCost);
        System.out.printf("Underage Surcharge: $%.2f%n", underageSurcharge);
        System.out.printf("Total Cost: $%.2f%n", totalCost);

        scanner.close();
    }
}