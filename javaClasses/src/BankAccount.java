public class BankAccount {
    private String accountNumber;
    private double balance;
    private String name;
    private String email;
    private String phone;

    public BankAccount() {
        this("9999", 0.00, "Default name", "Default email", "Default phone")
        System.out.println("Empty constructor created");
    }

    public BankAccount(String accountNumber, double balance, String name, String email, String phone) {
        this.accountNumber = accountNumber;
        this.balance = balance;
        this.name = name;
        this.email = email;
        this.phone = phone;
        System.out.println("Account created with customer info");
    }

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
