package practice;
class Student {
    private String name;
    private int age;
    
    public Student(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public static void printDetails(String name, int age) {
        System.out.println("Student Name: " + name);
        System.out.println("Age: " + age);
    }
}

class University {
    public void admitStudent(String name, int age) {
        System.out.println("Admitting Student to University...");
        Student.printDetails(name, age);
    }
}




public class StudentsMain{
	    public static void main(String[] args) {
	        University university = new University();
	        university.admitStudent("Alice", 22);
	    }
	}
//Create two classes: Student and University.
//The Student class has a static method printDetails() which prints the student's details. 
//The University class has a method admitStudent() that calls the static method printDetails() of the Student class.