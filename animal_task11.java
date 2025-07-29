package Task4_MultiThreading;

public class animal_task11 extends Thread {
	 public animal_task11(String name) {
		 super(name);
		 }
		 public void run() {
		 for(int i = 1; i <= 5; i++) {
		 System.out.println(getName() + " running " + i);
		 try {
		 Thread.sleep((int)(Math.random() * 1000));
		 } catch(Exception e) {}
		 }
		 }
		 public static void main(String[] args) {
		 new animal_task11("Tortoise").start();
		 new animal_task11("Rabbit").start();
		 new animal_task11("Dog").start();
		 }
		}