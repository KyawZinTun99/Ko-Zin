package practice;
//Interface
interface Animal {
 void makeSound();  // Abstract method (No body)
}

//Class implementing the interface
class Goat implements Animal {
 // Implementing the abstract method from the interface
 public void makeSound() {
     System.out.println("Goat barks:Pell Pell!");
 }
}

public class InterfaceExample {
 public static void main(String[] args) {
     // Creating an instance of Dog using the interface reference
     Animal myDog = new Goat();
     
     // Calling the method
     myDog.makeSound();  // Output: Dog barks: Woof Woof!
 }
}
