package Exercise;
class Example {
    static int count = 0;  // Shared among all objects
    int objectNumber;      // Unique to each object

    Example() {
        count++; // Increase the static count
        objectNumber = count; // Assign a unique number to this object
    }

    void display() {
        System.out.println("Count: " + objectNumber);
    }
}

public class Test {
    public static void main(String[] args) {
        Example e1 = new Example();
        Example e2 = new Example();
        Example e3 = new Example();

        e1.display(); // Output: Count: 1
        e2.display(); // Output: Count: 2
        e3.display(); // Output: Count: 3
    }
}
