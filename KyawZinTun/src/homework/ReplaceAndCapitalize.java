package homework;

import java.util.Scanner;

public class ReplaceAndCapitalize {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String input = scanner.nextLine();
        scanner.close();

        // Replace 'a' and 'A' with '@' and convert the string to uppercase
        String result = input.replace('a', '@').replace('A', '@').toUpperCase();

        // Display the result
        System.out.println("Modified String: " + result);
    }
}
