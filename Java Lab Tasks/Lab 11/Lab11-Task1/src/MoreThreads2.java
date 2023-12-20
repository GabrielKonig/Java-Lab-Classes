import java.util.ArrayList;
import java.util.List;

public class MoreThreads2 {

    private static List<Thread> childThreads = new ArrayList<>();

    public static void main(String[] args) throws InterruptedException {

        System.out.println("Main Thread Starts Running...");

        // Create and Start Child Threads
        Thread myThread1 = new Thread(new MyThreadVer3("Child Thread #1"));
        myThread1.start();

        Thread myThread2 = new Thread(new MyThreadVer3("Child Thread #2"));
        myThread2.start();

        Thread myThread3 = new Thread(new MyThreadVer3("Child Thread #3"));
        myThread3.start();

        // Wait for All Child Threads to Finish Executing
        for (Thread thread : childThreads) {
            thread.join();
        }

        System.out.println("Main Thread is Exiting...");
    }
}

class MyThreadVer3 implements Runnable {

    private String threadName;

    public MyThreadVer3(String threadName) {
        this.threadName = threadName;
    }

    @Override
    public void run() {
        System.out.println("Starting: " + threadName);

        try {
            for (int i = 0; i < 10; i++) {
                Thread.sleep(1000);
                System.out.println("Thread " + threadName + ": " + i);
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println("Exiting: " + threadName);
    }

    public static Thread createAndStart(String threadName) throws InterruptedException {
        Thread thread = new Thread(new MyThreadVer3(threadName));
        thread.start();
        childThreads.add(thread);
        return thread;
    }
}
