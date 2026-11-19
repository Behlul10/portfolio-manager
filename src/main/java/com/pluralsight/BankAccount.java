public class BankAccount implements Valuable {
    private double balance;

    public void withdraw(double amount) {
        this.balance -= amount;
    }

    public void deposit(double amount) {
        this.balance += amount;
    }

    public double getValue(){
        return this.balance;
    }
}
