
//Non-void method with inheritance(return type)
package Jwd;
//Parent Class (Superclass)
class Creature {
 // Method with int return type
 int getLegs() {
     return 4; // Most creatures have 4 legs
 }
}

//Child Class (Subclass)
class Bird extends Creature {
 // Overriding the method
	@Override  //same parent and child class name same (only child class will work.)
 int getLegs() {
     return 2; // Birds usually have 2 legs
 }
}

//Main Class
public class Inheritance2 {
 public static void main(String[] args) {
     Bird myBird = new Bird();
     System.out.println("Bird has " + myBird.getLegs() + " legs."); 
     
 }
}
