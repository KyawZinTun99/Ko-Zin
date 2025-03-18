package practice;
abstract class Animal2 {
    abstract void makeSound();  // Abstract method (must be implemented)

    void eat() {  // Concrete method (already implemented)
        System.out.println("This animal eats food.");
    }
}
//Subclass 1: Lion
class Lion extends Animal2 {
 void makeSound() {
     System.out.println("Lion roars: Roarrr!");
 }
}

//Subclass 2: Elephant
class Elephant extends Animal2  {
 void makeSound() {
     System.out.println("Elephant trumpets: Prrrr!");
 }
}

//Subclass 3: Snake
class Snake extends Animal2 {
 void makeSound() {
     System.out.println("Snake hisses: Sssss!");
 }
}

//Subclass 4: Frog
class Frog extends Animal2 {
 void makeSound() {
     System.out.println("Frog croaks: Ribbit Ribbit!");
 }
}
public class AbstractionExample {
    public static void main(String[] args) {
        Animal2 myLion = new Lion();
        myLion.makeSound();  
        myLion.eat();        

        Animal2 myElephant = new Elephant();
        myElephant .makeSound();  
        myElephant .eat();        

        Animal2 mySnake= new Snake();
        mySnake.makeSound();  
        mySnake.eat();        

        Animal2 myFrog = new Frog();
        myFrog.makeSound();  
        myFrog.eat();        
    }
}
