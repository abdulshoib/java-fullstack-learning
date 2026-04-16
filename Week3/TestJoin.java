
class JoinDemo extends Thread {

    public void run() {
        for (int i = 1; i <= 3; i++) {
            System.out.println("Thread running: " + i);
        }
    }
}

public class TestJoin {

    public static void main(String[] args) {

        JoinDemo t1 = new JoinDemo();
        JoinDemo t2 = new JoinDemo();

        t1.start();

        try {
            t1.join(); // wait for t1
        } catch (InterruptedException e) {
            System.out.println("Error");
        }

        t2.start();
    }
}
