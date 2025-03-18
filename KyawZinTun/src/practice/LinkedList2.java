package practice;
import java.util.LinkedList;

public class LinkedList2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     LinkedList<Integer> list=new LinkedList<>();
     list.add(2);
     list.add(20);
     list.add(12);
     list.add(6);
     list.add(8);
     list.add(29);
     
     System.out.println(list);
     System.out.println(list.get(2));
     
    int value= list.set(4, 1000);
     System.out.println(value);
     System.out.println(list);
     
      
     
		
		
	}

}
