
class Shared {

    int data;
    boolean hasData = false; // flag to check if data is available

    // Producer method
    synchronized void produce(int value) throws InterruptedException {

        // If data already exists, wait
        while (hasData) {
            wait(); // thread goes to waiting state
        }

        data = value; // produce data
        System.out.println("Produced: " + data);

        hasData = true; // mark data as available

        notify(); // wake up waiting thread (consumer)
    }

    // Consumer method
    synchronized void consume() throws InterruptedException {

        // If no data, wait
        while (!hasData) {
            wait(); // wait until producer produces
        }

        System.out.println("Consumed: " + data);

        hasData = false; // mark data as consumed

        notify(); // wake up producer
    }
}

public class ProducerConsumer {

    public static void main(String[] args) {

        Shared s = new Shared();

        // Producer Thread
        Thread producer = new Thread(() -> {
            try {
                for (int i = 1; i <= 5; i++) {
                    s.produce(i);
                }
            } catch (InterruptedException e) {
                System.out.println("Error");
            }
        });

        // Consumer Thread
        Thread consumer = new Thread(() -> {
            try {
                for (int i = 1; i <= 5; i++) {
                    s.consume();
                }
            } catch (InterruptedException e) {
                System.out.println("Error");
            }
        });

        producer.start(); // start producer
        consumer.start(); // start consumer
    }
}
