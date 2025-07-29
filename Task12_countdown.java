package Task4_MultiThreading;

public class Task12_countdown extends Thread {
	public void run() {
		 for(int i = 10; i >= 1; i--) {
		 System.out.println("Countdown: " + i);
		 try 
		 { 
			 Thread.sleep(1000); 
		 }
		 catch(Exception ex) {}
		 }
		 System.out.println("Time’s up!");
	  }
    public static void main(String[] args) {
	new Task12_countdown().start();
	}
}