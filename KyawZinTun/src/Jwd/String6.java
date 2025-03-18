package Jwd;
import java.util.Scanner;
import java.util.Random;

public class String6 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        System.out.println("Enter a string: ");
        String input = s.nextLine();

        // Process: scramble the words
        String scrambled = scrambleString(input);

        // Output: print the scrambled string
        System.out.println("Scrambled string: " + scrambled);

        s.close();
    }

    public static String scrambleString(String input) {
        String[] words = input.split(" ");
        StringBuilder scrambled = new StringBuilder();

        for (String word : words) {
            scrambled.append(scrambleWord(word)).append(" ");
        }

        return scrambled.toString().trim();
    }

    public static String scrambleWord(String word) {
        if (word.length() <= 3) {
            return word; // Don't scramble short words
        }

        char[] chars = word.toCharArray();
        Random random = new Random();

        // Scramble the middle characters
        for (int i = 1; i < chars.length - 1; i++) {
            int j = i + random.nextInt(chars.length - i); // Fixed line
            char temp = chars[i];
            chars[i] = chars[j];
            chars[j] = temp;
        }

        return new String(chars);
    }
}
