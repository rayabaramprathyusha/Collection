import java.util.*;

class Delivery{
    String Packageid;
    String Destination;
    boolean delivered;

    Delivery(String Packageid, String Destination) {
        this.Packageid = Packageid;
        this.Destination = Destination;
        this.delivered = false;
    }
    @Override
    public String toString() {
        return Packageid +"-->"+ Destination ;
    }

        }

public class DeliveryTracker {
    public static void main(String[] args) {
        LinkedList<Delivery> deliveries=new LinkedList<>();
        deliveries.add(new Delivery("Pk001", "Houston"));
        deliveries.add(new Delivery("Pk002", "Ohio"));
        deliveries.add(new Delivery("Pk003", "NewJersey"));
        deliveries.add(new Delivery("Pk004", "Dallas"));

        System.out.println("Welcome to Delivery Tracker");
        System.out.println(deliveries);

        while(!deliveries.isEmpty()){
            Delivery current=deliveries.pollFirst();
            current.delivered=true;
            System.out.println("Delivered "+current);
        }

        System.out.println("All Deliveries Completed");

    }
}
