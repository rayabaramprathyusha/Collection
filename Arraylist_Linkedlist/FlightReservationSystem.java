
import java.util.*;

class Flight {
    String flightNumber;
    String origin;
    String destination;
    double Fare;

    Flight (String flightNumber, String origin, String destination, double Fare) {
        this.flightNumber = flightNumber;
        this.origin = origin;
        this.destination = destination;
        this.Fare = Fare;
    }

    @Override
    public String toString() {   //to print class obj in a meaningful way
        return flightNumber + " - " + origin + " " + destination + "($ " + Fare+")";
    }
}

public class FlightReservationSystem {
    public static void main(String[] args) {
        List<Flight> flights = new ArrayList<>();

        System.out.println("Welcome to Flight ReservationSystem");

        flights.add(new Flight("A101","St.louis","NJ",650.50));
        flights.add(new Flight("A102","Dallas","Newyork",550.90));
        flights.add(new Flight("A103","NJ","houston",750.09));

        flights.sort(Comparator.comparingDouble(f->f.Fare)); //Sorts flights list in ascending order based on Farea

        System.out.println("Available Flights sorted by fare:");

        flights.forEach(System.out::println);  //java 8

        Scanner sc=new Scanner(System.in);
        System.out.print("Enter destination to search: ");
        String dest=sc.nextLine();

        boolean found=false;
        for(Flight f:flights){    //enhanced for loop
            if(f.destination.equalsIgnoreCase(dest)){
                System.out.println("Found Flight: "+f);
                found=true;
            }
        }
        if(!found)System.out.println("No flights found"+dest);
    }
}
