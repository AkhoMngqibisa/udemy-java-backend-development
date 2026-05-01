package threads;

public class MultipleThreads {

    public static void main(String[] args) {
        A objectA = new A();
        B objectB = new B();

        objectA.start();
        objectB.start();
    }
}

class A extends Thread {
    public void run() {
        for(int i=1; i<=10; i++){
            System.out.println("hi");
        }
    }
}

class B extends Thread {
    public void run() {
        for(int i=1; i<=10; i++){
            System.out.println("hello");
        }
    }
}
