
// Creating thread class
class PriorityDemo extends Thread {

    // run() method executed when thread starts
    public void run() {

        // print thread name + its priority
        System.out.println(
                Thread.currentThread().getName()
                + " is running with priority: "
                + Thread.currentThread().getPriority()
        );
    }
}

public class TestPriority {

    public static void main(String[] args) {

        // creating threads
        PriorityDemo t1 = new PriorityDemo();
        PriorityDemo t2 = new PriorityDemo();
        PriorityDemo t3 = new PriorityDemo();

        // setting thread names
        t1.setName("Low Priority Thread");
        t2.setName("Medium Priority Thread");
        t3.setName("High Priority Thread");

        // setting priorities
        t1.setPriority(Thread.MIN_PRIORITY);   // value = 1
        t2.setPriority(Thread.NORM_PRIORITY);  // value = 5 (default)
        t3.setPriority(Thread.MAX_PRIORITY);   // value = 10

        // starting threads
        t1.start();
        t2.start();
        t3.start();
    }
}
