package method;

public class StaticMethod {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(Mathadd.add(5,15));// no need to create object. just direct call
		
		
		
		
	}//p end
	public class Mathadd{
	 static int add (int a, int b) {
	return a+b;// have not void so need to write return look staticmethod1
	 }
}

}//class end
 






