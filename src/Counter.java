import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class Counter {
    Lock lock = new ReentrantLock();
    public volatile int count;
    public int getCount() {
        return count;
    }
    public void setCount(int count) {
        this.count = count;
    }

    public void increment() {
        lock.lock();
        count++;
        test();
    }
    public void test() {
        //
        lock.unlock();
        //
        //
    }

}
