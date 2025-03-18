package Jwd;

//parent class
class Animal{
	void eat() {
	System.out.println("This animal eats food.");	
	}	
}
//child class (inherits from animal)
class Dog extends Animal{//automatic connect parent and child
	void bark () {
		System.out.println("The dog barks.");
	 }

}



public class Inheritance1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Dog myDog =new Dog();// object create
myDog.eat();
myDog.bark();
	}

}
//void need to create object coz static ma pr bu  