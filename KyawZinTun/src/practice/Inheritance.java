package practice;
class Animals{
	public void getsound() {
		System.out.println("Some generic animal sound");
	}
}
class Dog extends Animals{
	public void getsound() {
	System.out.println("Wolf Wolf");
	}
}
 class Cat extends Animals{
	 public void getsound() {
		 System.out.println("Meow Meow");
	 }
 }





class Inheritance {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Dog dog = new Dog() ; 
		Animals cat = new Cat();
		dog.getsound();
		cat.getsound();
	}

}
