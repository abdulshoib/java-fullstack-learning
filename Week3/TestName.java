
class NameDemo extends Thread {

    public void run() {
        System.out.println("Thread name: " + Thread.currentThread().getName());
    }
}

public class TestName {

    public static void main(String[] args) {

        NameDemo t1 = new NameDemo();
        NameDemo t2 = new NameDemo();

        t1.setName("Worker-1");
        t2.setName("Worker-2");

        t1.start();
        t2.start();
    }
}
