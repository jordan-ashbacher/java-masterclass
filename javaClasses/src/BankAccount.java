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
        if (amount > balance) {
            System.out.println("Insufficient funds");
            return balance;
        } else {
            return balance -= amount;
        }
    }

    public void getBalance() {
        System.out.println(balance);
    }

}
