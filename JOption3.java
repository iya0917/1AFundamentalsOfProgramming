import javax.swing.JOptionPane;

public class JOption3 {
    public static void main(String[] args) {

        double nsat = Double.parseDouble(
                JOptionPane.showInputDialog("Enter NSAT score:")
        );

        double salary = Double.parseDouble(
                JOptionPane.showInputDialog("Enter parents' monthly salary:")
        );

        double entrance = Double.parseDouble(
                JOptionPane.showInputDialog("Enter entrance examination score:")
        );

        double average = (nsat + entrance) / 2;

        String result;

        if (salary > 10000 || nsat < 90 || entrance < 85) {
            result = "Application Rejected";
        } else if (salary <= 3500 && average >= 91) {
            result = "Application Accepted";
        } else {
            result = "Application for Further Study";
        }

        JOptionPane.showMessageDialog(null, result);
    }
}
