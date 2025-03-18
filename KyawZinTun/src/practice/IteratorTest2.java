package practice;
import java.util.*;

public class IteratorTest2{
    public static void main(String[] args) {
        List<Integer> numbers = new ArrayList<>(Arrays.asList(10, 20, 30, 40, 50));

        Iterator<Integer> itr = numbers.iterator();

        while (itr.hasNext()) {
            int num = itr.next();
            if (num == 30) {
                itr.remove(); // Removes 30 safely
            }
        }

        System.out.println(numbers);
    }
}
