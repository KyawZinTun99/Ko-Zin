import java.util.Random;
import java.util.Scanner;
public class Level1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner s= new Scanner(System.in);

Random r=new Random();
int randomNumber=r.nextInt(21);
System.out.println("Guess number 0 to 20");

System.out.println("Guess My Number");
int guessNumber=s.nextInt();

while(randomNumber!=guessNumber){
{System.out.println("No!You got it wrong");}
{System.out.println("Guess again");}
 guessNumber=s.nextInt();
}
System.out.println("Wow! You got it right");
System.out.println("Game Ended");
}
}