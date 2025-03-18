package Jwd;
import java.util.LinkedHashSet;

public class LinkedHashSet1{
	public static void main (String []args) {
		
  LinkedHashSet<Integer> set= new LinkedHashSet<>();
	set.add(30);
	set.add(20);
	set.add(10);
	set.add(50);
	set.add(30);
	// add element
	System.out.println(set);
	
	// checking if an element exits
	System.out.println(set.contains(50));
	System.out.println(set.contains(90));
	
	// remove elements
	set.remove(20);
	System.out.println(set);
	

	
	
	
	}
}