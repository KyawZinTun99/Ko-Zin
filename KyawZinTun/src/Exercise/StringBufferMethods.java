package Exercise;
public class StringBufferMethods {
    public static void main(String[] args) {
        StringBuffer sb = new StringBuffer("Hello");

        // Append (Concatenation)
        sb.append(" World");
        System.out.println(sb);  // Output: Hello World

        // Insert (Modify in between)
        sb.insert(6, "Beautiful ");
        System.out.println(sb);  // Output: Hello Beautiful World

        // Replace (Modify part of the string)
        sb.replace(6, 15, "Amazing");
        System.out.println(sb);  // Output: Hello Amazing World

        // Delete (Remove part of the string)
        sb.delete(6, 13);
        System.out.println(sb);  // Output: Hello World

        // Reverse (Completely modifies the string)
        sb.reverse();
        System.out.println(sb);  // Output: dlroW olleH

        // Capacity Example
        StringBuffer sbCap = new StringBuffer(20);
        System.out.println("Capacity: " + sbCap.capacity()); // Output: 20
        sbCap.append("Hello");
        System.out.println("Length: " + sbCap.length()); // Output: 5

        // Ensure Capacity
        sbCap.ensureCapacity(50);
        System.out.println("New Capacity: " + sbCap.capacity()); // Output: 50 (if increased)
    }
}
