import java.util.*;

class Crypto{
    String name;
    double quantity;
    double price;

    Crypto(String name,double quantity,double price) {
        this.name = name;
        this.quantity = quantity;
        this.price = price;
    }

    double totalValue(){
        return quantity*price;
    }
    public String toString(){
        return name+"- Holdings "+quantity+" |value :$"+totalValue();
    }
}

public class CryptoPortfolioAnalyzer {
    public static void main(String[] args) {

        List<Crypto> portfolio = new ArrayList<>();
        portfolio.add(new Crypto("Ethereum", 2.0, 3000));
        portfolio.add(new Crypto("Bitcoin",5.0,85000));
        portfolio.add(new Crypto("Solana", 10, 150));

        Collections.sort(portfolio, new Comparator<Crypto>() {
            @Override
            public int compare(Crypto a, Crypto b) {
                if (b.totalValue()>a.totalValue()) return 1;
                else if (b.totalValue()<a.totalValue()) return -1;
                else return 0;
            }
        });


        System.out.println("Your Portfolio High to low value: ");
        for (Crypto c : portfolio) {
            System.out.println(c);
        }

        double totalworth=0;
        for (Crypto c : portfolio) {
            totalworth+=c.totalValue();
        }
        System.out.println("Your Portfolio Low to high value: "+totalworth);

    }
}
