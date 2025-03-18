
import java.util.Scanner;
public class Sumdigit{ 

  public static void main(String[] args) {
    // TODO Auto-generated method stub
    Scanner s = new Scanner(System.in);
    System.out.println("enter a number");
    int number=s.nextInt();
    int result=sumDegits(number);
    System.out.println("the sum of the degits is "+result);
        
  }
  public static int sumDegits(int number) {
    int sum=0;
    while (number!=0) {
      sum+=number%10;
      number=number/10;}
    return sum;
    }
  }
