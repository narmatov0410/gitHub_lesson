import java.util.concurrent.atomic.AtomicInteger;

public class AtomicMain {
    static Integer n = 0;
static  AtomicInteger atomicInteger = new AtomicInteger(0);
    public static void main(String[] args) throws InterruptedException {

        Thread t1 = new Thread() {
            @Override
            public void run() {
                for (int i = 0; i < 1_000_000; i++) {
                    atomicInteger.addAndGet(1);
                }
            }
        };

        Thread t2 = new Thread() {
            @Override
            public void run() {
                for (int i = 0; i < 1_000_000; i++) {
                    atomicInteger.addAndGet(1);
                }
            }
        };

        t1.start();
        t2.start();
        t1.join();
        t2.join();
        System.out.println(atomicInteger.get());
    }
}
