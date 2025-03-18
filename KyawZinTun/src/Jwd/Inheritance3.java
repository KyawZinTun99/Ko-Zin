package Jwd;

//Parent Class (Superclass)
class Creation {
 // Method with int return type
 int getLegs() {
     return 4; // Most creatures have 4 legs
 }
}

//Child Class (Subclass)
class Parrot extends Creation {
 // Overriding the method
 @Override
 int getLegs() {
     return 2; // Birds usually have 2 legs
 }
 
 // Method to get Parent Class Legs
 int getParentLegs() {
     return super.getLegs(); // Calls the parent class method
 }
}

//Main Class
public class Inheritance3 {
 public static void main(String[] args) {
     Parrot myBird = new Parrot();

     System.out.println("Bird has " + myBird.getLegs() + " legs.");
     System.out.println("Parent Creature has " + myBird.getParentLegs() + " legs.");
 }
}
