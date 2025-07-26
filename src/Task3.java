package Task3_JavaExceptionalHandling;

public class Task3 {
	    final double PI = 3.14;

	    void show() {
	        System.out.println("PI = " + PI);
	        // PI = 3.1415; // Error if uncommented: cannot assign a value to final variable
	    }

	    public static void main(String[] args) {
	        Task3 obj = new Task3();
	        obj.show();
	    }
	}
