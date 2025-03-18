package practice;
class Shape {
    void draw() {
        System.out.println("Drawing a shape");
    }
}

class Circle extends Shape {
    @Override
    void draw() {
        System.out.println("Drawing a Circle");
    }
}

class Rectangle extends Shape {
    @Override
    void draw() {
        System.out.println("Drawing a Rectangle");
    }
}
//PolymorphismArray 
public class Overriding4 {
    public static void main(String[] args) {
        Shape[] shapes = { new Circle(), new Rectangle() };

        for (Shape shape : shapes) {
            shape.draw();
        }
        // Output:
        // Drawing a Circle
        // Drawing a Rectangle
    }
}
//Create a Shape class with a draw() method. Create subclasses Circle and Rectangle that override draw().
//Store different Shape objects in an array and call draw() dynamically.