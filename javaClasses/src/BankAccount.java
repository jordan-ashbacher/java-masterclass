public class BankAccount {
    private String accountNumber;
    private double balance = 0;
    private String name;
    private String email;
    private String phone;

    public double deposit(double amount) {
        return balance += amount;

    }

    public double withdraw(double amount) {
        if (amount > this.balance) {
            System.out.println("Insufficient funds");
            return this.balance;
        } else {
            return this.balance -= amount;
        }
    }

    public void getBalance() {
        System.out.println(this.balance);
    }

}
