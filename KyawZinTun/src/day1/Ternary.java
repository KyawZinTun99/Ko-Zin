package day1;

public class Ternary {
    public static void main(String[] args) {
        int value1 = 70, value2 = 20, value3 = 15;

        // ternary
        int max = (value1 > value2) ? 
                  ((value1 > value3) ? value1 : value3) : 
                  ((value2 > value3) ? value2 : value3);

        // Output the result
        System.out.println("The maximum value is: " + max);
    }
}
