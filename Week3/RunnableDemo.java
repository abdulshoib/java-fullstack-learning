
class MyRunnable implements Runnable {

    public void run() {
        System.out.println("Runnable thread running...");
    }
}

public class RunnableDemo {

    public static void main(String[] args) {

        MyRunnable r = new MyRunnable();
        Thread t = new Thread(r);

        t.start();

        System.out.println("Main thread");
    }
}
