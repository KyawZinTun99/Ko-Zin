package practice;

class Person{
	void speak() {
		System.out.println("Someone is speaking .");
	}	
}
class Students1 extends Person{
	void speak() {
		System.out.println("Student is speaking.");
	}
	void study () {
		System.out.println("Student is studying .");
	}
}





public class Overriding3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Students1 student= new Students1();
student.speak();
student.study();
	}

}
// not overriding just ouveloading method