import java.util.Scanner;
public class ShoppingCost {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner s=new Scanner(System.in);
{System.out.println("Enter your item.");}
int item=s.nextInt();
int total=0;
int Maximum=0;
int Minimum=Integer.MAX_VALUE;
for(int i=1;i<=item;i++){
{System.out.println("Enter item"+item+" "+ "Amount:");
int Amount=s.nextInt();

total+=Amount;
Maximum=Math.max(Maximum, Amount);
Minimum=Math.min(Minimum,Amount);
}}
System.out.println("Total amount"+total);
System.out.println("Average "+ total/item);
System.out.println("The Maximum value is: "+ Maximum);
System.out.println("The Minimum value is : "+ Minimum);


}	
		
}		
		
	


