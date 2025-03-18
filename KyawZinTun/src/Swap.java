 import java.util.Scanner;
public class Swap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		System.out.println("Enter value a and b");
		int a=s.nextInt();
		int b=s.nextInt();
		System.out.println("Before swap");
		System.out.println("a="+a);
		System.out.println("b="+b);
int tem=0;
tem=a;
a=b;
b=tem;
System.out.println("After swap");
System.out.println("a="+a);
System.out.println("b="+b);
	}

}
