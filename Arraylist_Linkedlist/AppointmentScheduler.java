import java.util.*;

class Appointment {
    String PatientName;
    String time;

    Appointment(String PatientName, String time) {
        this.PatientName = PatientName;
        this.time = time;
    }
    public String toString() {
        return PatientName+" at "+time;
    }
}
public class AppointmentScheduler {
    public static void main(String[] args) {
        LinkedList<Appointment> appointments = new LinkedList<>();

        appointments.add(new Appointment("Robinson","10:00 AM"));
        appointments.add(new Appointment("Vinny","11:00 AM"));
        appointments.add(new Appointment("Kint","12:00 PM"));

        System.out.println("Todays Appointments");
        appointments.forEach(System.out::println);

        System.out.println("Next Appointment: "+appointments.peek());
        appointments.poll();

        System.out.println("\n Remaining Appointments");
        appointments.forEach(System.out::println);

    }
}
