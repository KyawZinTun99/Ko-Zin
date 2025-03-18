package practice;
import java.util.ArrayList;
import java.util.List;
public class ArrayListTest {
    public static void main(String args[]) {
       ArrayList list=new ArrayList();

        list.add('c');  
        list.add(2);
        list.add("David");
        list.add(4.3);
        list.add("Java");

        System.out.println(list);  
        list.add(new Employee(null, 0));// different package so add (null,0)import lote
        System.out.println(list);
        
        System.out.println(list.get(1)); 
        
        
        double number = (double)list.get(3);
        
     
         
    }
}
