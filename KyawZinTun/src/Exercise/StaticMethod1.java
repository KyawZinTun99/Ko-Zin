// Static Method Accessing Static Variable
package Exercise;
class StaticMethod1 {
    static int count = 0; // Static variable

    // ✅ Define the static method correctly
    static void increment() {
        count++;
    }

    public static void main(String[] args) {
        StaticMethod1.increment(); // ✅ Correct way to call static method
        StaticMethod1.increment();
        System.out.println("Count: " + StaticMethod1.count);
    }
}
