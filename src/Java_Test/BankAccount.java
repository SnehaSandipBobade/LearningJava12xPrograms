package Java_Test;

public class BankAccount {
    private double balance;
    public void IntialBankBalance(double initialBalance){
        if (initialBalance >= 0) {
            this.balance = initialBalance;
            System.out.println("Bank Account created with initial balance: $" + this.balance);
        } else {
            this.balance = 0;
            System.out.println("Warning: Initial balance cannot be negative. Account created with $0.00.");
        }
    }
    public void deposit(double amount){
        if (amount > 0) {
            balance = balance + amount;
        System.out.println("Deposited: $" +  amount + ". New balance: $" + balance);
    } else {
        System.out.println("Deposit failed: Amount must be positive.");
    }
    }
    public void withdraw(double amount) {
        if (amount <= 0) {
            System.out.println("Withdrawal failed: Amount must be positive.");
        } else if (amount > balance) {
            System.out.println("Withdrawal failed: Insufficient funds. Current balance: $" +balance);
        } else {
            balance = balance- amount;
            System.out.println("Withdrew: $" +  amount + ". New balance: $" + balance);
        }
    }
    public double getBalance() {
        return balance;
    }
    public static void main(String[] args) {
        BankAccount b1 = new BankAccount();
        b1.IntialBankBalance(1500);
        b1.deposit(5000);
        b1.withdraw(500);
        b1.getBalance();
    }

}
