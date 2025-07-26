package JavaFundmTask1;

import java.util.Scanner;

public class DoWhile {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num;

        do {
            System.out.print("Enter a positive number (-1 to stop): ");
            num = sc.nextInt();
        } while (num != -1);

        System.out.println("Program ended.");
    }
}

/* Enter a positive number (-1 to stop): 8
Enter a positive number (-1 to stop): 5
Enter a positive number (-1 to stop): 5
Enter a positive number (-1 to stop): 545
Enter a positive number (-1 to stop): 58741
Enter a positive number (-1 to stop): -1
Program ended.
*/