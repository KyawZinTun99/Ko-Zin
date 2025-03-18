package Exercise;
class Counter {
    static int count = 0; // Shared among all instances

    Counter() {
        count++; // Increment the count when an object is created
    }

    void displayCount() {
        System.out.println("Total objects created: " + count);
    }
}

public class Test2 {
    public static void main(String[] args) {
        Counter c1 = new Counter();
        Counter c2 = new Counter();
        Counter c3 = new Counter();

        c3.displayCount(); // Output: Total objects created: 3
    }
}
