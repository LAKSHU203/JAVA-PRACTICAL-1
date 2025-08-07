public class BankAccount {

    // Number variable for balance
    double balance;

    // Constructor
    public BankAccount(double initialBalance) {
        balance = initialBalance;
    }

    // Function to deposit money
    public void deposit(double amount) {
        balance += amount;
    }

    // Function to withdraw money
    public void withdraw(double amount) {
        if (amount <= balance) {
            balance -= amount;
        } else {
            System.out.println("Insufficient balance!");
        }
    }

    // Function to get current balance
    public double getBalance() {
        return balance;
    }

    public static void main(String[] args) {
        BankAccount account = new BankAccount(1000.00);
        account.deposit(500.00);
        account.withdraw(200.00);

        System.out.println("Final Balance: $" + account.getBalance());
    }
}