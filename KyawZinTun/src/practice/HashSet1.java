package practice;

import java.util.HashSet;
public class HashSet1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashSet <String>set=new HashSet<>();
		set.add("Kyaw Kyaw");
		set.add("Kyaw Lay ");
		set.add("Kyaw Gyi");
		set.add("Kyaw Mue");
		System.out.println(set);
		
		
		HashSet<Integer>num=new HashSet<>();
		//add method
		num.add(20);
		num.add(22);
		num.add(12);
		num.add(25);
		num.add(27);
		System.out.println(num);
		//remove method
		num.remove(12);
		System.out.println(num);
		// using a for each loop
//		for (Integer value : num) {
//			System.out.println(value);
//			
//		}

	}

}
