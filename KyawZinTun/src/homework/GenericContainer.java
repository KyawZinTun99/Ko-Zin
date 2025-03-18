package homework;
import lombok.Getter;
import lombok.ToString;
@ToString 

class GC<T>{
	T object;
	
   public GC(T object) {
   this.object=object;
	}
}

public class GenericContainer {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		GC<Integer> intGC=new GC<>(345);
		System.out.println(intGC);
		
	    GC<String> stgGC=new GC<>("Hello , guys.");
		System.out.println(stgGC);
		
		
		Employee emp= new Employee (106,"Thura");//emp obj create
		
		GC<Employee> empGC= new GC<>(emp);
		
		System.out.println(empGC);
	}

}
