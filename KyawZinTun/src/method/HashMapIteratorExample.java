package method;
import java.util.*;

public class HashMapIteratorExample {
    public static void main(String[] args) {
        Map<Integer, String> map = new HashMap<>();
        map.put(1, "One");
        map.put(2, "Two");
        map.put(3, "Three");

        Iterator<Map.Entry<Integer, String>> itr = map.entrySet().iterator();

        while (itr.hasNext()) {
            Map.Entry<Integer, String> entry = itr.next();
            System.out.println(entry.getKey() + " : " + entry.getValue());
        }
    }
}
 