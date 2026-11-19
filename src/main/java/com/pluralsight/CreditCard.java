public class CreditCard implements Valuable {
    double balance;

    public void charge(double amount){
        this.balance += amount;
    }

    public void pay(double amount){
        this.balance -= amount;
    }


    public double getValue() {
        return this.balance;
    }
}
