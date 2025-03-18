package Exercise;

public class StaticMethod {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
   showMessage();
   int result=add(5,28);
   System.out.println("Add :"+ result);
	}
   static void showMessage() {
   System.out.println("Hello from a static method.");
}
   static int add (int a, int b) {
   return a+b;
}






}//class end
// Why use static? No need to create an object;
//we can call showMessage() directly.