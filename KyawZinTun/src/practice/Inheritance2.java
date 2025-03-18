package practice;
class Employee{
	String name;
	double salary;
	
Employee(String name, double salary){
	this.name=name;
	this.salary=salary;}
	void showDetails() {
	System.out.println("Name :"+name);
	System.out.println("Salary $:"+ salary);
		}
	}
class Manager extends Employee{
	String department;
	Manager(String name,double salary,String department){
	super(name,salary);
	this.department=department;
	}
	void showDetails() {
	super.showDetails();
	System.out.println ("Department :"+ department);
	}
}
// developer class
class Developer extends Employee{
	String programmingLanguage;
	Developer (String name,double salary,String department,String programmingLanguage){
	super(name,salary);
	this.programmingLanguage=programmingLanguage;
	}
	void showDetails() {
	super.showDetails();
	System.out.println("Programmming Language :"+ programmingLanguage);}
}
public class Inheritance2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    Employee manager=new Manager("Kyaw Gyi",900000,"IT");
    manager.showDetails();
    Employee developer=new Developer ("Kyaw Lay",9500000,"IT","Java");
    developer.showDetails();
	}

}
