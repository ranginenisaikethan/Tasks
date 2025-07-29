package Task4_MultiThreading;

public class Task5_Proirity extends Thread {
    public void run() {
        System.out.println(Thread.currentThread().getName() + " Priority: " +
                           Thread.currentThread().getPriority());
    }

    public static void main(String[] args) {
    	Task5_Proirity t1 = new Task5_Proirity();
    	Task5_Proirity t2 = new Task5_Proirity();
    	Task5_Proirity t3 = new Task5_Proirity();

        t1.setPriority(Thread.MIN_PRIORITY);   // 1
        t2.setPriority(Thread.NORM_PRIORITY);  // 5
        t3.setPriority(Thread.MAX_PRIORITY);   // 10

        t1.setName("Low");
        t2.setName("Medium");
        t3.setName("High");

        t1.start();
        t2.start();
        t3.start();
    }
}
