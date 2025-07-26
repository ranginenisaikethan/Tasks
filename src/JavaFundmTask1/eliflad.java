package JavaFundmTask1;
import java.util.Scanner;

public class eliflad{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); // Create scanner object

        System.out.print("Enter your percentage: ");
        int percentage = sc.nextInt(); // Read integer input

        if (percentage >= 85 && percentage <= 100) {
            System.out.println("FCD !!!");
        } else if (percentage >= 60 && percentage < 85) {
            System.out.println("First Class");
        } else if (percentage >= 35 && percentage < 60) {
            System.out.println("Pass Class");
        } else if (percentage >= 0 && percentage < 35) {
            System.out.println("Fail !!!");
        } else {
            System.out.println("Enter percentage between 0 and 100");
        }
    }
}
