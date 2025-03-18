package homework;
import lombok.Getter;
//import lombok.Setter;
import lombok.ToString;
import java.util.*;

@Getter
//@Setter
@ToString
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
}

public class StudentMain{
    public static void main(String[] args) {
        // ArrayList of students
        List<Student> List = new ArrayList<>();
        List.add(new Student("S01", "Thura", 18));
        List.add(new Student("S02", "Kay Kay", 19));
        List.add(new Student("S03", "Chaw Chaw Oo", 22));
        List.add(new Student("S04", "Yan Kyaw Htet", 17));
        List.add(new Student("S05", "Yar Zar Aung", 20));

        // students under 20 years old
        System.out.println("Students under 20 from ArrayList:");
        for (Student s : List) {
            if (s.getAge() < 20) {
                System.out.println(s);
            }
        }
 
        System.out.println("---------------------------");

        //  LinkedList of students
        List<Student> linkedList = new LinkedList<>();
        linkedList.add(new Student("S06", "Nay Zar Linn", 21));
        linkedList.add(new Student("S07", "Tay Zar Linn", 23));
        linkedList.add(new Student("S08", "Nann Mya Thida", 19));
        linkedList.add(new Student("S09", "Khunn Khant ", 25));
        linkedList.add(new Student("S10", "Pyae Sone aung",26));

        // students over 20 years old
        System.out.println("Students over 20 from LinkedList:");
        for (Student s : linkedList) {
            if (s.getAge() > 20) {
                System.out.println(s);
            }
        }
    }//void end
}//studentMain end
