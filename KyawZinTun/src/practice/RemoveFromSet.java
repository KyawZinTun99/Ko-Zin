package practice;
import java.util.*;

public class RemoveFromSet {
    public static void main(String[] args) {
        Set<String> set = new HashSet<>(Arrays.asList("Apple", "Banana", "Cherry", "Mango"));

        Iterator<String> itr = set.iterator();

        while (itr.hasNext()) {
            String fruit = itr.next();
            if (fruit.equals("Banana")) {
                itr.remove(); // Removes "Banana"
            }
        }

        System.out.println(set); // Output: [Apple, Cherry, Mango]
    }
}
