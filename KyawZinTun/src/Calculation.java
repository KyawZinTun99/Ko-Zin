import java.util.Scanner;
class Calculation{
public static void main(String[]args){
Scanner s=new Scanner(System.in);
System.out.println("Enter any two numbers");
int value1=s.nextInt(); 
int value2=s.nextInt();
System.out.println("Enter an operator: 1: +,2: - ,3: * ,4: /");
int operator=s.nextInt();

switch(operator)
{case 1:Sum(value1 , value2);
 break;
 case 2:Substraction(value1 , value2);
 break;
 case 3:Multiple(value1 ,value2);
 break;
 case 4:Division(value1 , value2);
 break;
 default:System.out.println("pick a number between 1 to 4");
 break;
}//case end
}//p end
public static void Sum(int a,int b)
{System.out.println(a+b);}
public static void Substraction(int a,int b)
{System.out.println(a-b);}
public static void Multiple(int a,int b)
{System.out.println(a*b);}
public static void Division(int a,int b)
{System.out.println(a/b);}

}//class end