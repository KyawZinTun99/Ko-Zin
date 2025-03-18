
import java.util.Scanner;
public class Sorting {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		System.out.println("Enter number of value");
		int length=s.nextInt();
		int[]A=new int[length];
	     for (int i=0;i<length;i++){
	    {System.out.println("Enter value"+(i+1));
	     A[i]=s.nextInt();}
	     //before
	    System.out.println("Before Sorting");
	     System.out.println("your entered numbers are");
	     for(int j=0;j<length;j++)
	     System.out.print(A[j]+",");}
	     
		for(int i=0;i<length-1;i++)
		{for (int j=i+1;j<length;j++)
		{if (A[j]>A[i])
		{int tem=0;
		tem=A[j];
		A[j]=A[i];
	    A[i]=tem;}
		           }
		             }
		System.out.println("After Sorting");
		for(int i=0;i<length;i++)
		     System.out.print(A[i]+",");
	}
}
