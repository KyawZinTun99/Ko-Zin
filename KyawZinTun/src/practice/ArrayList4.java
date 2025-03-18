 package practice;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;



public class ArrayList4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Integer> numbers = new ArrayList<>();
        numbers.add(1);
        numbers.add(2);
        numbers.add(2);
        numbers.add(3);
        numbers.add(4);
        numbers.add(4);
		
		//remove duplicates from an arraylist
		HashSet<Integer> uniqueNumbers =new HashSet<>(numbers);
		numbers.clear();
		numbers.addAll(uniqueNumbers);

		System.out.println(numbers);
		
		//max number
		int max=Collections.max(numbers);
		System.out.println(max);

	}

}
