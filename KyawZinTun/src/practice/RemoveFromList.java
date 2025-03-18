package practice;
import java.util.*;

public class RemoveFromList {
    public static void main(String[] args) {
        List<Integer> numbers = new ArrayList<>(Arrays.asList(10, 20, 30, 40, 50));

        Iterator<Integer> itr = numbers.iterator();

        while (itr.hasNext()) {
            int num = itr.next();
            if (num == 30) {
                itr.remove(); // Safe removal
            }
        }

        System.out.println(numbers); // Output: [10, 20, 40, 50]
    }
}
