package day1;

import java.util.Scanner;

public class exercise{
    // Method to calculate profit or loss
    public static void calculateProfitOrLoss(double costPrice, double sellingPrice) {
        if (sellingPrice > costPrice) {
            double profit = sellingPrice - costPrice;
            System.out.println("Profit: $" + profit);
        } else if (sellingPrice < costPrice) {
            double loss = costPrice - sellingPrice;
            System.out.println("Loss: $" + loss);
        } else {
            System.out.println("No Profit, No Loss");
        }
    }

    // Method to print odd numbers from 1 to 100
    public static void printOddNumbers() {
        System.out.println("Odd numbers from 1 to 100:");
        for (int i = 1; i <= 100; i += 2) {
            System.out.print(i + " ");
        }
        System.out.println();
    }

    // Method to determine the grade of steel
    public static void gradeSteel(double hardness, double carbon, double tensile) {
        boolean condition1 = hardness > 50;
        boolean condition2 = carbon < 0.7;
        boolean condition3 = tensile > 5600;

        int grade;
        if (condition1 && condition2 && condition3) {
            grade = 10;
        } else if (condition1 && condition2) {
            grade = 9;
        } else if (condition2 && condition3) {
            grade = 8;
        } else if (condition1 && condition3) {
            grade = 7;
        } else if (condition1 || condition2 || condition3) {
            grade = 6;
        } else {
            grade = 5;
        }

        System.out.println("Steel Grade: " + grade);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Profit or Loss Calculation
        System.out.print("Enter the cost price: ");
        double costPrice = scanner.nextDouble();
        System.out.print("Enter the selling price: ");
        double sellingPrice = scanner.nextDouble();
        calculateProfitOrLoss(costPrice, sellingPrice);

        // Print odd numbers from 1 to 100
        printOddNumbers();

        // Steel Grading System
        System.out.print("Enter the hardness value: ");
        double hardness = scanner.nextDouble();
        System.out.print("Enter the carbon content: ");
        double carbon = scanner.nextDouble();
        System.out.print("Enter the tensile strength: ");
        double tensile = scanner.nextDouble();
        gradeSteel(hardness, carbon, tensile);

        scanner.close();
    }
}
