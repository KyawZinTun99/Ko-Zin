package method;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import lombok.Getter;
import lombok.ToString;

@ToString
@Getter
class Student {
        private String id;
        private String name;
        private int age;

    // Constructor
public Student(String id, String name, int age) {
        this.id = id;
        this.name = name;
        this.age = age;
    }
}//students class end

public class StudentMain {
    public static void main(String[] args) {
        // ArrayList of Students
        ArrayList<Student> list = new ArrayList<>();
        list.add(new Student("S100", "KayKay", 24));
        list.add(new Student("S101", "Cherry", 24));
        list.add(new Student("S102", "Khun Khant", 24));
        list.add(new Student("S103", "Thura", 18));
        
        //condition check
        System.out.println("Students under 20 years old:");
        for (Student student : list) {
          if (student.getAge() < 20) {
                System.out.println(student);  
            }
        }

        //  LinkedList of Students
        List<Student> studentLinkedList = new LinkedList<>();
        studentLinkedList.add(new Student("S004", "Si Thu", 19));
        studentLinkedList.add(new Student("S005", "Nanda", 20));
        studentLinkedList.add(new Student("S006", "Nage Lay", 21));
        studentLinkedList.add(new Student("S007", "Shine Khant", 22));
        studentLinkedList.add(new Student("S008", "Zar Ni Tun", 23));

        //condition check
        System.out.println("Students over 20 years old are:");
        for (Student student : studentLinkedList) {
            if (student.getAge() > 20) {
                System.out.println(student);
            }
        }
    }// void end
}//StudentMain end
