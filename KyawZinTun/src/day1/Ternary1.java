package day1;
public class Ternary1 {
    public static void main(String[] args) {
        int[] numbers = {10, 5, 25, 8, 15};

        // Initial max value as first element
        int max = numbers[0];

        // Iterate through the array using ternary operator
        for (int i = 1; i < numbers.length; i++) {
            max = (numbers[i] > max) ? numbers[i] : max;
        }

        // Output max value
        System.out.println("Maximum value: " + max);
    }
}
