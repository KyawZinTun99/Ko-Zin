   import java.util.Scanner;
public class Fibonacci {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner s=new Scanner(System.in);
{System.out.println("Enter your first and second number");}
int a=s.nextInt();
int b=s.nextInt();
{System.out.println("F0:"+a);}
{System.out.println("F1:"+b);}
for (int i=2;i<=100;i++)
{int c=a+b;
System.out.println("F"+i+":"+c);
a=b;
b=c;}	
		
	}

}
