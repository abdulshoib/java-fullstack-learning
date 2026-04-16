
class SleepDemo extends Thread {

    public void run() {
        for (int i = 1; i <= 5; i++) {
            System.out.println(i);

            try {
                Thread.sleep(1000); // 1 second delay
            } catch (InterruptedException e) {
                System.out.println("Error");
            }
        }
    }
}

public class TestSleep {

    public static void main(String[] args) {

        SleepDemo t1 = new SleepDemo();
        t1.start();
    }
}
