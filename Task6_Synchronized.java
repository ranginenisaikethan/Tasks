package Task4_MultiThreading;

public class Task6_Synchronized extends Thread {
    static int counter = 0;

    public void run() {
        for (int i = 0; i < 1000; i++) {
            counter++;
        }
    }

    public static void main(String[] args) {
    	Task6_Synchronized t1 = new Task6_Synchronized();
    	Task6_Synchronized t2 = new Task6_Synchronized();

        t1.start();
        t2.start();

        try {
            t1.join();
            t2.join();
        } catch (Exception e) {}

        System.out.println("Final Counter Value: " + counter);
    }
}
