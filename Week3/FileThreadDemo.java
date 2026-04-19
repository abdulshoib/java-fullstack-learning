
import java.io.*;

// Shared class for writing file
class FileWriterDemo {

    // synchronized method → only one thread writes at a time
    synchronized void writeToFile(String msg) {

        try {
            FileWriter fw = new FileWriter("log.txt", true);

            fw.write(msg + "\n"); // write message
            fw.close();

            // print which thread wrote
            System.out.println(Thread.currentThread().getName() + " wrote: " + msg);

        } catch (IOException e) {
            System.out.println("Error writing file");
        }
    }
}

// Thread class
class MyThread extends Thread {

    FileWriterDemo obj;

    // constructor
    MyThread(FileWriterDemo obj) {
        this.obj = obj;
    }

    public void run() {

        // each thread writes 3 times
        for (int i = 1; i <= 3; i++) {
            obj.writeToFile("Message " + i);
        }
    }
}

public class FileThreadDemo {

    public static void main(String[] args) {

        FileWriterDemo obj = new FileWriterDemo();

        // create threads
        MyThread t1 = new MyThread(obj);
        MyThread t2 = new MyThread(obj);

        t1.setName("Thread-1");
        t2.setName("Thread-2");

        // start threads
        t1.start();
        t2.start();
    }
}
