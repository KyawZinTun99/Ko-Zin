package homework;
import java.util.Scanner;
public class InitialUpperCase {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner Name=new Scanner (System.in);

		System.out.println("Enter Your fullName:.");
		String fullName = Name.nextLine();
		
		String[] nameParts = fullName.split(" ");//make user fullname into part 
		
		StringBuilder initials = new StringBuilder();//modify string
		
		for (String part : nameParts) {
            initials.append(part.charAt(0)); // first letter of the part of the fullname //output
        }
		// Display the initials in uppercase
        System.out.println("Your initials are: " + initials.toString().toUpperCase());
        
	}

}
       
        