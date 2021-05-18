public class BankAccount {
    private String accountNumber;
    private double balance = 0;
    private String name;
    private String email;
    private String phone;

    public void deposit(double amount) {
        this.balance += amount;

    }

    public void withdraw(double amount) {
        if (amount > this.balance) {
            System.out.println("Insufficient funds");
        } else {
            this.balance -= amount;
        }
    }

    public double getBalance() {
        return this.balance;
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public String setAccountNumber(String accountNumber) {
        return this.accountNumber = accountNumber;
    }



}
