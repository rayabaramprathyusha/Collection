import java.util.*;
class Order{
    int OrderID;
    String Customername;
    String Product;
    double Price;
    Order(int OrderID, String Customername, String Product, double Price){
        this.OrderID = OrderID;
        this.Customername = Customername;
        this.Product = Product;
        this.Price = Price;
    }
}

public class OrderTrackingSystem {
    public static void main(String[] args) {
        LinkedHashMap<Integer, Order> orders=new LinkedHashMap<>();

        orders.put(101,new Order(101,"Jack","Penguin",100.00));
        orders.put(102,new Order(102,"priya","Mobile",850.00));
        orders.put(103,new Order(103,"Alex","Tablet",600.75));

        System.out.println("Current Orders");
        for(Order order:orders.values()){
            System.out.println(order.OrderID+" "+order.Customername+" "+order.Product+" "+order.Price);
        }

    }
}
