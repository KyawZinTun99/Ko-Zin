package practice;
import java.util.HashMap;
public class HashMap1 {
	public static void main (String []args) {
		HashMap<String, Integer> map= new HashMap<>();
		
		//adding  key value pair
		map.put("Kyaw", 25);
		map.put("Kay", 24);
		map.put("Khant", 20);
		
		//checking values
		System.out.println(map.containsKey("Kay"));
		
		//accessing values
		System.out.println(map.get("Kyaw"));
		
		//
	
	}

}
