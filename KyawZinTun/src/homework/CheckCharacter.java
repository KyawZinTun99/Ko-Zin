package homework;
import java.util.Scanner;
public class CheckCharacter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner (System.in);
		String choice;
		
		do {
		{System.out.println("Enter a character");}
		char character=s.next().charAt(0);
		
		if (Character.isLowerCase(character)) {
        System.out.println("This is a lowercase letter.");}
		else if( Character.isUpperCase(character)) {
		System.out.println("This is a Uppercase letter.");}
		else  if (Character.isDigit(character)) {
		System.out.println("The character is a digit.");}
		else {System.out.println("This is special symbol.");}
		
		{System.out.println("Do you want to check another character? Yes or No.)");}
        choice = s.next();

    }
		while (choice.equalsIgnoreCase("Yes")||choice.equalsIgnoreCase("Y")); 

	 System.out.println("Well done . Thank you");	
		
		
	}//p end

}//class end 
