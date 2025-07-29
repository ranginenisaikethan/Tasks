package Task4_MultiThreading;

public class Task7_lock extends Thread {
    static int counter = 0;
    static Object lock = new Object();

    public void run() {
        for (int i = 0; i < 1000; i++) {
            synchronized (lock) {
                counter++;
            }
        }
    }

    public static void main(String[] args) {
    	Task7_lock t1 = new Task7_lock();
        Task7_lock t2 = new Task7_lock();

        t1.start();
        t2.start();

        try {
            t1.join();
            t2.join();
        } catch (Exception e) {}

        System.out.println("Final Counter Value: " + counter);
    }
}
