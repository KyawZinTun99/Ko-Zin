import java.util.Scanner;
public class SalaryCalculation {
    public static void main(String[] args) {
        final int MAXTIME = 160;
        final double ENGINEERHOURLYPAY = 30.0;
        final double TECHNICIANHOURLYPAY = 25.5;
        final double OVERTIMERATE = 1.5;

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter position (1 for Engineer, 2 for Technician): ");
        int position = scanner.nextInt();
        System.out.println("Enter hours worked: ");
        int hoursWorked = scanner.nextInt();

        double salary = 0.0;

        switch (position) {
        case 1: //for Engineer
        if (hoursWorked > MAXTIME) {
        int overtimeHours = hoursWorked - MAXTIME;
        salary = (MAXTIME * ENGINEERHOURLYPAY) + (overtimeHours * ENGINEERHOURLYPAY * OVERTIMERATE);
        } else {
        salary = hoursWorked * ENGINEERHOURLYPAY;
        }
        System.out.println("Engineer Salary: $" + salary);
        break;

        case 2: //for  Technician
        if (hoursWorked > MAXTIME) {
        int overtimeHours = hoursWorked - MAXTIME;
        salary = (MAXTIME * TECHNICIANHOURLYPAY) + (overtimeHours * TECHNICIANHOURLYPAY * OVERTIMERATE);
        } else {
        salary = hoursWorked * TECHNICIANHOURLYPAY;
        }
        System.out.println("Technician Salary: $" + salary);
        break;

        default:
        System.out.println("Invalid position entered. Please enter 1 for Engineer or 2 for Technician.");
        break;
        }//switch end    
    }//p end
}//c end
