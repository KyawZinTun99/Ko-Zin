package Jwd;
import java.util.Scanner;  // Scanner Class ကို Import

enum Level1 {
    LOW, MEDIUM, HIGH;
}

public class EnumTest1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); // Scanner Object တစ်ခု Create
        System.out.println("Enter Level (LOW, MEDIUM, HIGH): ");
        
        String userInput = scanner.next().toUpperCase(); // User Input ကို UpperCase ပြောင်း
        scanner.close(); // Scanner ကိုပိတ်

        try {
        	Level1  myLevel = Level1 .valueOf(userInput); // Enum Value ဖြစ်စေရန် ပြောင်း

            if (myLevel == Level1.HIGH) {
                System.out.println("High level selected!");
            } else if (myLevel == Level1.MEDIUM) {
                System.out.println("Medium level selected!");
            } else {
                System.out.println("Low level selected!");
            }

        } catch (IllegalArgumentException e) {
            System.out.println("Invalid input! Please enter LOW, MEDIUM, or HIGH.");
        }
    }
}
