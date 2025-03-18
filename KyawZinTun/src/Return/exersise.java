package Return;

public class exersise {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int result=cube(10);
System.out.println(result);
int area=Area(11,23);
System.out.println(area);
int volume=Volume(22,33,10);
System.out.println(volume);
double result1=Add(10,30);
System.out.println("Sum:"+result1);
	}
	
	public static int cube(int number) {
		int result=number *number*number;
		return result;
		}
	public static int Area(int x, int y) {
		int result=x*y;
		return result;
	}
	public static int Volume(int a, int b, int c) {
		int Volume=a*b*c;
		return Volume;
	}
	public static double Add(int num1,  double num2) {
		
		return num2-num1;
	}	
	
	
	
	
	
	
	

}//class end
