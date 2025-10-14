import java.util.LinkedHashSet;

public class BrowserHistory {
    public static void main(String[] args) {
        LinkedHashSet<String> history = new LinkedHashSet<String>();

        history.add("https://www.google.com");
        history.add("https://www.facebook.com");
        history.add("https://www.youtube.com");
        history.add("https://www.stackoverflow.com");
        history.add("https://www.youtube.com");

        System.out.println("Browser History");
        for (String url : history) {
            System.out.println(url);
        }
        System.out.println("Size of browser history"+history.size());
        System.out.println("Removing google.com");
        history.remove("https://www.google.com");

        System.out.println("Updated History"+history);


    }
}
