package wrapper_classes_task5;

import java.util.Scanner;

class BankDetails {
    String accountNumber = "SBI0022123";
    Double balance = 1000.00;  // Initial balance

    void deposit(double amount) {
        balance += amount;
        System.out.println("Balance after deposit: " + balance);
    }

    void withdraw(double amount) {
        if (amount <= balance) {
            balance -= amount;
            System.out.println("Balance after withdrawal: " + balance);
        } else {
            System.out.println("Insufficient balance.");
        }
    }

    void showBalance() {
        System.out.println("Account Number: " + accountNumber);
        System.out.println("Current Balance: " + balance);
    }
}

public class BankAccount_Task8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        BankDetails bd = new BankDetails();

        bd.showBalance();

        System.out.println("\nWhat would you like to do?");
        System.out.println("Press 1 to Deposit");
        System.out.println("Press 2 to Withdraw");
        System.out.print("Enter your choice: ");
        int choice = sc.nextInt();

        if (choice == 1) {
            System.out.print("Enter amount to deposit: ");
            double depAmount = sc.nextDouble();
            bd.deposit(depAmount);
        } else if (choice == 2) {
            System.out.print("Enter amount to withdraw: ");
            double withdrawAmount = sc.nextDouble();
            bd.withdraw(withdrawAmount);
        } else {
            System.out.println("Invalid choice. Please select 1 or 2.");
        }

        bd.showBalance();
        sc.close();
    }
}

// my best till date... haha


/* Create a class BankAccount with:
o AccountNumber (String)
o Balance (Double wrapper)
 Add methods: deposit(double amount), withdraw(double amount), and show balance.
 Demonstrate how wrapper handles null balance (set default to 0.0 if null).
*/