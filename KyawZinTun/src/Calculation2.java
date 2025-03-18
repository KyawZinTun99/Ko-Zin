import java.util.Scanner;
class Calculation2{
public static void main(String[]args){
Scanner s=new Scanner(System.in);
System.out.println("Enter any two numbers");
int value1=s.nextInt(); 
int value2=s.nextInt();
System.out.println("Enter an operator: 1: +,2: - ,3: * ,4: /");
int operator=s.nextInt();

switch(operator)
{case 1:int result=Sum(value1 ,value2);
System.out.println(result); 
 break;
 case 2:int result1=Substraction(value1 , value2);
 System.out.println(result1); 
 break;
 case 3:int result2=Multiple(value1 ,value2);
 System.out.println(result2); 
 break;
 case 4:int result3=Division(value1 , value2);
 System.out.println(result3); 
 break;
 default:System.out.println("pick a number between 1 to 4");
 break;
}
}//p end
public static int Sum(int a,int b)
{return(a+b);}
public static int Substraction(int a,int b)
{return(a-b);}
public static int Multiple(int a,int b)
{return(a*b);}
public static int Division(int a,int b)
{return(a/b);}

}//class end
