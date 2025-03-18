import java.util.Scanner;
public class EvenOdd {
public static void main(String[]args) {
Scanner s=new Scanner(System.in);
	System.out.println("Enter the length or size");
	int length=s.nextInt();
	int []A=new int[length];
	int even=0;
	int odd=0;
for( int i=0;i<length;i++) { 	
	System.out.println("Enter number"+ (i+1));
	A[i]=s.nextInt();}
System.out.println("Your entered numbers are:");
    for( int i=0;i<length;i++) { 	
    System.out.println( A[i]+",");}
    
    for (int i=0;i<length;i++)
    	if(A[i]%2==0) {
    		even=even+1;}
    	else {odd=odd+1;}
    System.out.println("Total Even Number:"+ even);
    System.out.println("Total Odd Number:"+ odd);
    
}//c end
}//p end 