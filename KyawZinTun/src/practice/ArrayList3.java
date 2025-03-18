package practice;
import java.util.ArrayList;
import java.util.Arrays;

public class ArrayList3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	//Convert an Array to an ArrayList	
	String []arr = {"Red","Blue","Green"};
	ArrayList<String> colors=new ArrayList<>(Arrays.asList(arr));
		
	System.out.println(colors);
		
	}

}
