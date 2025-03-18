package practice;
class Parent {
    void display() { 
        System.out.println("Parent");
    }
}

class Child extends Parent {
    @Override
    void display() { 
        System.out.println("Child");
    }
}

public class Overridding2 {  // This must match the filename "Overriding2.java"
    public static void main(String[] args) {
        Parent p = new Child();
        p.display();  // Output: "Child"
    }
}
