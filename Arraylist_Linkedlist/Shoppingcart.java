import java.util.*;

class Product {
    String name;
    double price;

    Product(String name, double price) {
        this.name = name;
        this.price = price;
    }

    @Override
    public String toString() {
        return name+"($"+price+")";
    }
}


public class Shoppingcart {
    public static void main(String[] args) {
        ArrayList<Product> cart = new ArrayList<>();
        cart.add(new Product("Laptop",500.00));
        cart.add(new Product("Tablet",200.00));
        cart.add(new Product("Smart Watch",100.00));
        cart.add(new Product("Air pods",50.00));

        double total=0;
        for(Product p:cart) {
            total+=p.price;
        }
        System.out.println("Items in cart:");
        cart.forEach(System.out::println);
        System.out.println("Total price:"+total);

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter an item to remove");
        String removeitem = sc.nextLine();

        boolean bought=cart.removeIf(p->p.name.equalsIgnoreCase(removeitem));
        if(bought) {
            System.out.println("Item removed Successfully from cart");
        }
        else {
            System.out.println("Item not found");
        }

        System.out.println("Remaining items in cart: after removal");
        cart.forEach(System.out::println);
        double total2=0;
        for(Product p:cart) {
            total2+=p.price;
        }
        System.out.println("Total price:"+total2);
        sc.close();

    }
}
