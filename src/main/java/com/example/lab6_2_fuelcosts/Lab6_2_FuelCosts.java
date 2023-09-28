package com.example.lab6_2_fuelcosts;
import java.util.Scanner;

public class Lab6_2_FuelCosts {

        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            double gallonsInTank, fuelEfficiency, gasPrice;

            do {
                System.out.print("Enter the number of gallons of gas in the tank: ");
                if (scanner.hasNextDouble()) {
                    gallonsInTank = scanner.nextDouble();
                    break;
                } else {
                    System.out.println("Invalid input. Please enter a valid number.");
                    scanner.next();
                }
            } while (true);

            do {
                System.out.print("Enter the fuel efficiency in miles per gallon: ");
                if (scanner.hasNextDouble()) {
                    fuelEfficiency = scanner.nextDouble();
                    break;
                } else {
                    System.out.println("Invalid input. Please enter a valid number.");
                    scanner.next();
                }
            } while (true);

            do {
                System.out.print("Enter the price of gas per gallon: ");
                if (scanner.hasNextDouble()) {
                    gasPrice = scanner.nextDouble();
                    break;
                } else {
                    System.out.println("Invalid input. Please enter a valid number.");
                    scanner.next();
                }
            } while (true);

            double costPer100Miles = (100 / fuelEfficiency) * gasPrice;

            double distanceWithTank = gallonsInTank * fuelEfficiency;

            System.out.println("Cost per 100 miles: $" + costPer100Miles);
            System.out.println("The car can go approximately " + distanceWithTank + " miles with the gas in the tank.");

            scanner.close();
        }

}
