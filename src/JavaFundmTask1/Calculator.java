package JavaFundmTask1;

import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int result = 0;

        System.out.print("Enter first number: ");
        int num1 = sc.nextInt();

        System.out.print("Enter second number: ");
        int num2 = sc.nextInt();

        System.out.println("Choose operation: +,  -,  *,  /");
        char op = sc.next().charAt(0);

        switch (op) {
            case '+':
                result = num1+num2;
                System.out.println("Result = " + result);
                break;

            case '-':
                result = num1-num2;
                System.out.println("Result = " + result);
                break;

            case '*':
                result = num1+num2;
                System.out.println("Result = " + result);
                break;

            case '/':
                if (num2 != 0) {
                    result = num1/num2;
                    System.out.println("Result = " + result);
                } else {
                    System.out.println("Cannot divide by zero");
                }
                break;

            default:
                System.out.println("Enter Valid Operator");
        }

    }
}
