package method;

public class MethodAndPara {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
System.out.println(methodA("David"));
methodB();
MethodAndPara s= new MethodAndPara();
s.methodC();
}//public end
 
public static String methodA(String name) {
return "hello" +" "+ name ;
}	
	
public static void methodB() {
System.out.println("I'm method B.");	
}
public void methodC(){
System.out.println("I'm method C.");
}
static {
	System.out.println("I'm static block");
}

}// class end
