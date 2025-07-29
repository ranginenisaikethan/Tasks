package Task4_MultiThreading;

public class IsAlive_Task4 extends Thread {
    public void run() {
        for (int i = 1; i <= 4; i++) {
            System.out.println("Running: " + i);
            }
        }

    public static void main(String[] args) throws InterruptedException {
    	IsAlive_Task4 t = new IsAlive_Task4();
        System.out.println("Before start: " + t.isAlive());
        t.start();
        System.out.println("After start: " + t.isAlive());
        t.join();
        System.out.println("Is Alive after join: " + t.isAlive());

    }
}
