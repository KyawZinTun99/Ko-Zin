package homework;
import java.util.Scanner;

public class RepeatedCharacters {
    // Method to find and print repeated characters in the string
    public static void findRepeatedCharacters(String input) {
        int length = input.length();
        boolean[] visited = new boolean[length]; // To track checked characters

        System.out.println("Repeated characters:");
        for (int i = 0; i < length; i++) {
            if (visited[i]) // Skip already checked characters
                continue;

            char currentChar = input.charAt(i);
            int count = 1;

            for (int j = i + 1; j < length; j++) {
                if (currentChar == input.charAt(j)) {
                    count++;
                    visited[j] = true; // Mark character as counted
                }
            }

            if (count > 1) {
                System.out.println(currentChar + ": " + count);
            }
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your Word:");
        String input = sc.nextLine();
        
        // Call the method to find repeated characters
        findRepeatedCharacters(input);
        
        sc.close(); // Close the scanner
    }
}
