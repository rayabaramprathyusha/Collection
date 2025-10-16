import java.util.*;

public class LinkedHashMapDemo {
    public static void main(String[] args) {
        LinkedHashMap<Integer,String> products = new LinkedHashMap<>();
        products.put(104,"Laptop");
        products.put(101,"Computer");
        products.put(102,"Smart watch");

        System.out.println("Products in Linked Hashmap"+products);
        System.out.println("Products with id 101"+products.get(101));

        products.remove(102);
        System.out.println("Products after removal"+products);

        for (Map.Entry<Integer, String> product : products.entrySet()) {
            System.out.println("Product id: "+product.getKey()+" Product name: "+product.getValue());
        }
    }

}
