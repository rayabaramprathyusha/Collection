import java.util.HashSet;

public class EmployeeIDTracker {
    public static void main(String[] args){
        HashSet<String> EmployeeIds = new HashSet<String>();
        EmployeeIds.add("EMP101");
        EmployeeIds.add("EMP102");
        EmployeeIds.add("EMP103");
        EmployeeIds.add("EMP104");
        EmployeeIds.add("EMP103"); // Automatically removes duplicates

        System.out.println("EmployeeIds in the System");
        for(String id:EmployeeIds){
            System.out.println(id);
        }
        System.out.println("All Unique employee ids "+EmployeeIds);
        System.out.println("Total Unique employees size "+EmployeeIds.size());
    }
}
