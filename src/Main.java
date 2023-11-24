import java.util.ArrayList;
import java.util.Vector;

public class Main {

    public static void main(String[] args) throws InterruptedException {
        String resource1 = "A";
        String resource2 = "B";
        Producer producer = new Producer(resource1, resource2);
        Consumer consumer = new Consumer(resource1, resource2);

        producer.start();
        consumer.start();

        producer.join();
        consumer.join();
        System.out.println("Main End");

    }
}