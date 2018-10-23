import javax.swing.*;

public class BankAccTest {
    public static void main(String[] args) {


        SavingsAccount savingsAccount = new SavingsAccount("Tracey",123,56000);

        JOptionPane.showMessageDialog(null,savingsAccount.toString());
    }
}
