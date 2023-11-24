
import java.util.List;
import java.util.concurrent.BlockingQueue;

public class Consumer extends Thread {
    private String resource1;
    private String resource2;

    public Consumer(String resource1, String resource2) {
        this.resource1 = resource1;
        this.resource2 = resource2;
    }

    @Override
    public void run() {
        synchronized (resource1) {
            try {
                System.out.println(getName() + " resource1");
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            synchronized (resource2) {
                System.out.println(getName() + " resource2");
            }
        }

    }

}
