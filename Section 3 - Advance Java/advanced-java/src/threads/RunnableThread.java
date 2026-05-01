package threads;

public class RunnableThread {
    public static void main(String[] args) {

        E objectE = new E();
        F objectF = new F();

        Thread t1 = new Thread(objectE);
        Thread t2 = new Thread(objectF);

        t1.start();
        t2.start();
    }
}

class E implements Runnable {
    public void run() {
        for(int i=1; i<=5; i++){
            System.out.println("hi");
            try {
                Thread.sleep(10);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}

class F implements Runnable {
    public void run() {
        for(int i=1; i<=5; i++){
            System.out.println("hello");
            try {
                Thread.sleep(10);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}

