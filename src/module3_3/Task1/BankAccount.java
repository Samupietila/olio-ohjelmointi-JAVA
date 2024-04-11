package module3_3.Task1;

public class BankAccount {
    private double balance;
    private static int id;
    private int accountNumber;

    public BankAccount(double balance) {
        this.balance = balance;
        id++;
        this.accountNumber = id;
    }
    private static int getTotalAccounts() {
        return id;
    }

    private double getBalance() {
        return balance;
    }

    private int getAccountNumber() {
        return accountNumber;
    }

    private void withdraw(int i) {
        this.balance += i;
    }

    private void deposit(int i) {
        this.balance -= i;
    }

    public static void main(String[] args) {
        BankAccount account1 = new BankAccount(1000);
        BankAccount account2 = new BankAccount(2000);

        account1.deposit(500);
        account2.withdraw(800);

        System.out.println("Account " + account1.getAccountNumber() + " balance: " + account1.getBalance());
        System.out.println("Account " + account2.getAccountNumber() + " balance: " + account2.getBalance());

        System.out.println("Total number of accounts: " + BankAccount.getTotalAccounts());
    }
}
