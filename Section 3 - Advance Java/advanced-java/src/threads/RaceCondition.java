package threads;

public class RaceCondition {

    public static void main(String[] args) throws InterruptedException {

        Counter c = new Counter();

        Runnable objectE = () -> {
            for (int i = 1; i <= 1000; i++) {
                c.increment();
            }
        };

        Runnable objectF = () -> {
            for (int i = 1; i <= 1000; i++) {
                c.increment();
            }
        };

        Thread t1 = new Thread(objectE);
        Thread t2 = new Thread(objectF);

        t1.start();
        t2.start();

        t1.join();
        t2.join();

        System.out.println("Count : "+c.count);
    }
}

class Counter {
    int count;

    public synchronized void increment() {
        count++;
    }
}
