package homework;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
public class Employee {
    private int empId;
    private String name;

 
    public Employee(int empId, String name) {
        this.empId = empId;
        this.name = name;
    }

    public static void main(String[] args) {
        Employee emp = new Employee(106, "Thura");

        
        System.out.println("Employee ID: " + emp.getEmpId());
        System.out.println("Employee Name: " + emp.getName());
        System.out.println(emp);
    }
}
