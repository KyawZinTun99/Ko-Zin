package practice;
import java.util.*;

public class IteratorTest1{
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("Apple");
        list.add("Banana");
        list.add("Cherry");

        // Create Iterator
        Iterator<String> itr = list.iterator();

        // Traverse the list using Iterator
        while (itr.hasNext()) {
            System.out.println(itr.next());
        }
    }
}
