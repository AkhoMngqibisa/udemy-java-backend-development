package threads;

public class ThreadPriority {
    public static void main(String[] args) {
        C objectC = new C();
        D objectD = new D();

        objectD.setPriority(Thread.MAX_PRIORITY);

        System.out.println("--->> Object D Priority :"+objectD.getPriority());

        objectC.start();
        objectD.start();
    }
}

class C extends Thread {
    public void run() {
        for(int i=1; i<=10; i++){
            System.out.println("hi");
            try {
                Thread.sleep(10);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}

class D extends Thread {
    public void run() {
        for(int i=1; i<=10; i++){
            System.out.println("hello");
            try {
                Thread.sleep(10);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}
