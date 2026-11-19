 import javax.swing.JOptionPane;

    public class no1JOption {
        public static void main(String[] args) {
            int num = Integer.parseInt(
                    JOptionPane.showInputDialog("Enter number 1:"));
            int highest = num, lowest = num;

            for (int i = 2; i <= 10; i++) {
                num = Integer.parseInt(
                        JOptionPane.showInputDialog("Enter number " + i + ":"));
                if (num > highest) highest = num;
                if (num < lowest) lowest = num;
            }
            JOptionPane.showMessageDialog(null,
                    "Highest: " + highest + "\nLowest: " + lowest);
        }
    }

