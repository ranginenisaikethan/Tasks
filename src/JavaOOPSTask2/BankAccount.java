package JavaOOPSTask2;

public class BankAccount {
	
	private long accountnumber;
	private double balance;
	
	public BankAccount(int accNum, double initialBal) {
		accountnumber = accNum;
		balance = initialBal;
	}
	
	void deposite(double amount) {
		if(amount > 0) {
			balance += amount;
		}
		
	}
	void withdraw(double amount) {
		if(amount>0) {
			balance-=amount;
		}
	}

    public double getBalance() {
        return balance;
    }
    public static void main(String[] args) {
        BankAccount myAccount = new BankAccount(784566523, 10000);
        myAccount.deposite(580);
        myAccount.withdraw(210);
        System.out.println("Total Balance: " + myAccount.getBalance());
    }
}

