package Task3_JavaExceptionalHandling;
	import java.util.Scanner;

	public class TryCatch_Task5_1 {
	    public static void main(String[] args) {
	        Scanner sc = new Scanner(System.in);
	        System.out.print("Enter a number to divide hundred: ");
	        try {
	            int num = sc.nextInt();
	            int result = 100 / num;
	            System.out.println("Result: " + result);
	        } catch (ArithmeticException e) {
	            System.out.println("Can not divide by num zero");
	        }
	    }
	}
