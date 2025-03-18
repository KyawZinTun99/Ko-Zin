package practice;
import java.util.ArrayList;
public class ArrayList1 {
public static void main(String[]args) {
ArrayList<String> fruits =new ArrayList<>();

fruits.add("Apple");
fruits.add("Orange");
fruits.add("Mango");
System.out.println(fruits);

//modify elements
fruits.set(2,"Cherry" );
System.out.println(fruits);


//remove elements
fruits.remove("Apple");
//fruits.remove(1); same as line 18
System.out.println(fruits);

// check if an element exits
System.out.println(fruits.contains("lemon"));
System.out.println(fruits.contains("Apple"));
}
}
