import java.util.*;
public class HashMapDemo {
    public static void main(String[] args) {
        HashMap<Integer, String> employees = new HashMap<>();
        employees.put(1, "John");
        employees.put(2, "Robert");
        employees.put(3, "Jane");
        employees.put(4, "Julie");

        System.out.println("Employees in company"+employees);

        System.out.println("Employee with id number-2: "+employees.get(2));

        employees.remove(1);

        System.out.println("Employees after removal "+employees);

        System.out.println("Iterating through employees ");
        for (Map.Entry<Integer, String> employee : employees.entrySet()) {
            System.out.println("Employee id: "+employee.getKey()+" Employee name: "+employee.getValue());
        }


    }
}
