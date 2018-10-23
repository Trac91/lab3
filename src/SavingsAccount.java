import javax.swing.*;

public class SavingsAccount extends BankAccount{

    private double balance;

    public SavingsAccount(String name, int accnum, double balance)

    {
        //setName(name);
        //setAccNum(accnum);
        super(name,accnum);
        setBalance(balance);

    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    @Override
    public double calcTax() {
        double taxRate = Double.parseDouble(JOptionPane.showInputDialog("Please enter tax rate"));
        return balance * taxRate/100;
    }

    @Override
    public void lodge(double a) {
        balance += a;

    }

    @Override
    public void withdraw(double a) {
        balance -= a;

    }

    @Override
    public String toString() {
        return super.toString() + "Balance: " + getBalance();
    }
}
