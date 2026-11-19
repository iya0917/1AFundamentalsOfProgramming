import javax.swing.JOptionPane;

public class no3JOption {
    public static void main(String[] args) {
        double balance = 20000.00;

        double amount = Double.parseDouble(
                JOptionPane.showInputDialog("Enter amount (0 to stop):"));

        while (amount != 0) {
            if (amount < 0 && balance + amount < 0) {
                JOptionPane.showMessageDialog(null, "INSUFFICIENT FUNDS!");
            } else {
                balance += amount;
            }
            JOptionPane.showMessageDialog(null,
                    String.format("Outstanding balance: P%,.2f", balance));

            amount = Double.parseDouble(
                    JOptionPane.showInputDialog("Enter amount (0 to stop):"));
        }
    }
}


