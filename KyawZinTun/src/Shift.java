import java.util.Scanner;
public class Shift {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner s=new Scanner (System.in);
System.out.println("Enter the value(length)");
int length=s.nextInt();
int[]A=new int [length];
 
for (int i=0;i<length;i++) {
	System.out.println("Enter the value"+(i+1)+":");	
		A[i]=s.nextInt();}
System.out.println("Before shift ");
		System.out.println("Your Entered numbers are:");
		for(int i=0;i<length;i++) {
		System.out.print(A[i]+",");}
		
		int tem=A[0];
		for(int i=0;i<length-1;i++)
		A[i]=A[i+1];
		A[length-1]=tem;
		
		System.out.println(" After shift");
		for (int i=0;i<length;i++)
			System.out.print(A[i]+",");
	}//pend

}//c end
