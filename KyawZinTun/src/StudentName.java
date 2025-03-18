 import java.util.Scanner;
public class StudentName {

  public static void main(String[] args) {
    // TODO Auto-generated method stub
Scanner s=new Scanner(System.in); 
System.out.println("Enter number of value");

int length=s.nextInt();
String[]Students=new String [length];

for (int i=0;i<length;i++)
{System.out.println("Enter the students'name"+(i+1));
Students[i]=s.next();
  }

System.out.println("All students");
System.out.println("No   Name");
System.out.println("==   ======");

for(int j=0;j<length;j++)
{System.out.println ((j+1)+"     "+ Students[j]);
  }






  }

}