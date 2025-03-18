import java.util.Scanner;
public class Shop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner s=new Scanner(System.in);
{System.out.println("Enter your item.");}
int item=s.nextInt();
int total=0;
int max=0;
int min=0;
for(int i=1;i<=item;i++){
{System.out.println("Enter item"+i+" "+ "Amount:");
int Amount=s.nextInt();

total+=Amount;
if (i==1)
	max=Amount;
else {if (Amount>max)
	max=Amount;
}
if (i==1)
	min=Amount;
else {if (Amount<min)
	min=Amount;
}
}}
System.out.println("Total amount"+total);
System.out.println("Average "+ total/item);
System.out.println("The Maximum value is: "+ max);
System.out.println("The Minimum value is : "+ min);


}	
		
}		
		
	