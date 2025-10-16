import java.util.*;

class Patient{
    String name;
    int priority;
    Patient(String name,int priority){
        this.name=name;
        this.priority=priority;
    }
    public String toString(){
        return name+"(Priority: "+priority+")";
    }
}

public class HospitalQueue {
    public static void main(String[] args) {
        PriorityQueue<Patient> emergencyQueue = new PriorityQueue<>(Comparator.comparing(p->p.priority));
        emergencyQueue.offer(new Patient("John",3));
        emergencyQueue.offer(new Patient("Jane",1));
        emergencyQueue.offer(new Patient("Bob",2));

        System.out.println("Patient in Queue (by priority)"+emergencyQueue);

        while(!emergencyQueue.isEmpty()){
            Patient p=emergencyQueue.poll();
            System.out.println("Treating Patient "+p);
        }



    }
}
