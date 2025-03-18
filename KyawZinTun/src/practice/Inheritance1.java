package practice;

class Vehicle{
	String brand;
	Vehicle(String brand) {
	this.brand=brand;
	}
	
	public void move() {
	System.out.println("The vehicle is moving .");

	}
}

class Car extends Vehicle{
	Car (String brand){
	super(brand);
	}
	
	
	public void move () {
		System.out.println(brand + " car is moving ");
	}
}
class Bike extends Vehicle{
	Bike(String brand){
		super(brand);
	}
	public void move () {
		System.out.println(brand + " Bike is moving .");
	}
}


public class Inheritance1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    Vehicle car=new Car("Toyota");
    Vehicle bike=new Bike("Yamaha");
    car.move();
    bike.move();
	}

}
