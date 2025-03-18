import java.util.Scanner;
public class ArrayMinMax {
public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner s=new Scanner(System.in); 
System.out.println("Enter number of value");
int total=0;
int Maximum=0;
int Minimum=0;

     int length=s.nextInt();
     int[]A=new int[length];
     for (int i=0;i<length;i++){
    {System.out.println("Enter value"+(i+1));
     A[i]=s.nextInt();}
	
     System.out.println("your entered numbers are");
     for(int j=0;j<length;j++) {
     System.out.print(A[j]+",");}
	
     
     total+=A[i];
     if (i==0)
    	 Maximum=A[i];
     else {if (A[i]>Maximum)
    	 Maximum=A[i];}
     if (i==0)
    	 Minimum=A[i];
     else {if (A[i]<Minimum)
    	 Minimum=A[i];}
     }//for end
     System.out.println("Total amount"+total);
     System.out.println("Average "+ total/length);
     System.out.println("The Maximum value is: "+ Maximum);
     System.out.println("The Minimum value is : "+ Minimum);
	}
	}
	


