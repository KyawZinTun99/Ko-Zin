package practice;
import java.util.ArrayList;
import java.util.Collections;

public class ArrayList2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
ArrayList<Integer>numbers= new ArrayList<>();

numbers.add(1);
numbers.add(10);
numbers.add(17);
numbers.add(11);
numbers.add(19);
numbers.add(17);
numbers.add(17);
numbers.add(19);

//ascending order
Collections.sort(numbers);
System.out.println(numbers);

// reverse 
Collections.reverse(numbers);
System.out.println(numbers);




	}

}
