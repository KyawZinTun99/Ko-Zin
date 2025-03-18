
public class Car {

	double engine;
	int seats;
	String lincine;
	String color;
	public static void Drive()
	{System.out.println("Car is driving. ");
	     }
	public static void stop()
	{System.out.println("Car is stop. ");}

	

}//c end

class Cartest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
			
		Car c=new Car();
		c.engine=2.5;
		c.seats=4;
		c.lincine="AA123";
		c.color="white";
		c.Drive();
		c.stop();			
		
	}

}

