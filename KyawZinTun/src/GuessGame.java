import java.util.Random;
import java.util.Scanner;
public class GuessGame {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner s= new Scanner(System.in);

Random r=new Random();
int randomNumber=r.nextInt(7);

System.out.println("Guess Number");
int guessNumber=s.nextInt();

if (randomNumber==guessNumber)
	System.out.println("You win");
	else 
		{System.out.println("You lose");}
		
		
		
		
		
		
	}

}
