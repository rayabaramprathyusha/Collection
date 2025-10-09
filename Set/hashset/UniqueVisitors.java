import java.util.HashSet;
import java.util.Random;

public class UniqueVisitors {
    public static void main(String[] args) {
        Random random = new Random();
        HashSet<Integer> visitors = new HashSet<>();

        for (int i = 0; i < 100; i++) {
            int userId = random.nextInt(50);
            visitors.add(userId);
        }
        System.out.println("Total visits:100");
        System.out.println("unique visitors:" + visitors.size()); //unique visitors as random can repeat visitor from 0-49
        System.out.println("Visitor Ids: " + visitors);
    }
}

//random will choose random visitors of the website
