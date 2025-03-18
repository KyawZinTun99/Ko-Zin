
import java.util.Scanner;
public class FindNumber {

  public static void main(String[] args) {
    // TODO Auto-generated method stub

    Scanner s = new Scanner(System.in);
    System.out.println("Enter the length of the array:");
    int length = s.nextInt();
        int[] numbers = new int[length];

        
        
        System.out.println("Enter the numbers:");
        for(int i = 0; i < length; i++) {
             numbers[i]=s.nextInt();}
            
            
            System.out.println("Enter the search number:");
       int searchnumber=s.nextInt();
  
 
        for (int i=0;i<length;i++)
         if (numbers[i]==searchnumber)
        System.out.println("Number found at index:"+ i);
}

}

