package homework;

import java.util.ArrayList;
import java.util.List;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
class EMP { // ✅ Renamed from Employee to EMP
    private int empId;
    private String name;

    // ✅ Step 1: Constructor to initialize EMP data
    public EMP(int empId, String name) {
        this.empId = empId;
        this.name = name;
    }
}

// ✅ Step 2: Generic Container class to hold multiple objects
@ToString
class GC1<T> {
    private List<T> objects;

    public GC1(List<T> objects) {
        this.objects = objects;
    }
}

public class GenericContainer1 {
    public static void main(String[] args) {
        // ✅ Step 3: Create multiple EMP objects (instead of Employee)
        EMP emp1 = new EMP(101, "Khin Wint War");
        EMP emp2 = new EMP(102, "Soe Pyae Thazin");
        EMP emp3 = new EMP(103, "Nandar Hlaing");

        // ✅ Step 4: Store EMP objects inside a List
        List<EMP> empList = new ArrayList<>();
        empList.add(emp1);
        empList.add(emp2);
        empList.add(emp3);

        // ✅ Step 5: Create a GenericContainer (GC) that stores multiple EMP objects
        GC1<EMP> empGC = new GC1<>(empList);

        // ✅ Step 6: Print the stored EMP data
        System.out.println(empGC);
    }
}
