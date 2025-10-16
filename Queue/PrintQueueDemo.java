
import java.util.*;

class PrintJob {
    String document;
    int pages;

    PrintJob(String document, int pages){
        this.document = document;
        this.pages = pages;
    }

    @Override
    public String toString() {
        return document+" ("+pages+"pages)";
    }
}

public class PrintQueueDemo{
    public static void main(String[] args){
        Queue<PrintJob> printerQueue = new LinkedList<>();

        printerQueue.offer(new PrintJob("Resume.pdf",2));
        printerQueue.offer(new PrintJob("Report.pdf",10));
        printerQueue.offer(new PrintJob("Invoice.xls",4));

        while(!printerQueue.isEmpty()){
            PrintJob job =printerQueue.poll();
            System.out.println("Printing"+job);
        }
    }
}