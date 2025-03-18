import java.util.Random;
import java.util.Scanner;
public class Level2{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner s= new Scanner(System.in);
Random r=new Random();
int randomNumber=r.nextInt(21);
System.out.println("Guess number 0 to 20");

System.out.println("Guess My Number");
int guessNumber=s.nextInt();
int count=1;
String str1="yes";
while(randomNumber!=guessNumber)
	{
		if(guessNumber<0||guessNumber>20)
	{
		System.out.println("Read the game info idiot,guess the number between 0 to 20");
		guessNumber=s.nextInt();
		count++;
		}
	
	else 
		{
			if(guessNumber-randomNumber<=3 && guessNumber-randomNumber>=-3)
			{
		
				System.out.println("No!! You got it wrong!! Your number is close to my number");
			}
			
			else {
				System.out.println("No!! You got it wrong!! Your number is too far to my number");
			}
			guessNumber=s.nextInt();
	count++;
		
		}
	}
switch(count)
{case 1:System.out.println("Wow! You got it right"+count+"st time");break;
 case 2:System.out.println("Wow! You got it right"+count+"nd time");break;
 case 3:System.out.println("Wow! You got it right"+count+"rd time");break;
 default:System.out.println("Wow! You got it right"+count+"th time");

		}
System.out.println("Wow! You got it right"+count+"time");
{System.out.println("Game Ended");}
}
}
	

	

