package day1;
import java.util.Scanner;
public class grading {

	public static void main(String[] args) {
		
		// TODO Auto-generated method stub
Scanner s=new Scanner (System.in);
{System.out.println("Enter hardness value");}
double hardness=s.nextDouble();	
{System.out.println("Enter carbon value");}
double carbon=s.nextDouble();	
{System.out.println("Enter tensile hardness value");}
double tensileHardness=s.nextDouble();	
		
boolean state1 = hardness > 50;
boolean state2 = carbon < 0.7;
boolean state3 = tensileHardness > 5600;

if (state1 && state2 && state3) {
	System.out.println("Steel Grade is 10");
} else if (state1 && state2) {
	System.out.println("Steel Grade is 9");
} else if (state2 && state3) {
	System.out.println("Steel Grade is 8");
} else if (state1 && state3) {
	System.out.println("Steel Grade is 7");
} else if (state1 || state2 || state3) {
	System.out.println("Steel Grade is 6");
} else {
	System.out.println("Steel Grade is 5");
}

System.out.println();
		
		
	}

}//class end 
