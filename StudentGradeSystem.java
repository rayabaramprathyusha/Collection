import java.util.*;

public class StudentGradeSystem {
    public static void main(String[] args) {
        HashMap<String, HashMap<String,Integer>> studentGrades = new HashMap<>();

        HashMap<String, Integer> RamGarde = new HashMap<>();
        RamGarde.put("Math", 95);
        RamGarde.put("Science", 80);
        RamGarde.put("Computer Science", 80);
        RamGarde.put("English", 87);

        HashMap<String, Integer> priyaGrades=new HashMap<>();
        priyaGrades.put("Math", 100);
        priyaGrades.put("Science", 75);
        priyaGrades.put("Computer Science", 95);
        priyaGrades.put("English", 85);

        studentGrades.put("Ram",RamGarde);
        studentGrades.put("Priya",priyaGrades);

        for(String student:studentGrades.keySet()){
            System.out.println("Student: "+student);
            HashMap<String, Integer> grades = studentGrades.get(student);
            int total=0;
            for(Map.Entry<String, Integer> entry:grades.entrySet()){
                System.out.println(entry.getKey()+": "+ entry.getValue());
                total+=entry.getValue();
            }
            System.out.println("Average: "+(total/grades.size()));
        }

    }
}

