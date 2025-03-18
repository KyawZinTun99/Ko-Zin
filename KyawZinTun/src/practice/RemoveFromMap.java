package practice;
import java.util.*;

public class RemoveFromMap {
    public static void main(String[] args) {
        Map<Integer, String> map = new HashMap<>();
        map.put(1, "One");
        map.put(2, "Two");
        map.put(3, "Three");

        Iterator<Map.Entry<Integer, String>> itr = map.entrySet().iterator();

        while (itr.hasNext()) {
            Map.Entry<Integer, String> entry = itr.next();
            if (entry.getKey() == 2) {
                itr.remove(); // Removes entry with key 2
            }
        }

        System.out.println(map); // Output: {1=One, 3=Three}
    }
}
