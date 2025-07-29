package Task4_MultiThreading;

public class Runnable_Counter implements Runnable {
	
	    public void run() {
	        for (int i = 1; i <= 10; i++) {
	            System.out.println(i);
	            try {
	                Thread.sleep(500); 
	            } catch (InterruptedException ex) {
	                System.out.println("Thread interrupted: " + ex.getMessage());
	            }
	        }
	    }

	    public static void main(String[] args) {
	        Runnable_Counter counter = new Runnable_Counter(); 
	        Thread thread = new Thread(counter);             
	        thread.start();                               
	    }
	}
