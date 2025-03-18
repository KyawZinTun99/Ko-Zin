import java.util.Scanner;
public class Shape{
     public static void main(String[] args) {
        Scanner a = new Scanner(System.in);
        System.out.println("Whhich one do you know? (1=Triangle,2=Circle,3=Square)");
        int choice= a.nextInt();
        
       
        switch (choice) {
            case 1: 
            System.out.println("Enter your base value");
            int b=a.nextInt();
            System.out.println("Enter your height value");
            int h=a.nextInt();        
            Triangle(b,h);
                break;
            case 2:
            System.out.println("Enter your base value");
            int r=a.nextInt();      
            Circle(r);
                break;
            case 3:
            System.out.println("Enter your width value");
            int w=a.nextInt();
            System.out.println("Enter your height value");
            int l=a.nextInt();        
            Square(w,l);
                break;        
            default:System.out.println("Please enter only(1=Trialgle,2=Circle,3=Square)");
                
        }
    }
    public static void Triangle(int a,int b) {      
        System.out.println(0.5*a*b);
    }
    public static void Circle(int a) {      
        System.out.println(3.14*a*a);
    }
    public static void Square(int a,int b) {      
        System.out.println(a*b);
    }
     
}//c end