import javax.swing.*;

public class SavingsAccount extends BankAccount{

    private double balance;



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
}
