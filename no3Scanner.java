import java.util.Scanner;

public class no3Scanner {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double balance = 20000.00;

        System.out.print("Enter amount (0 to stop): ");
        double amount = sc.nextDouble();

        while (amount != 0) {
            if (amount < 0 && balance + amount < 0) {
                System.out.println("INSUFFICIENT FUNDS!");
            } else {
                balance += amount;
            }
            System.out.printf("Outstanding balance: P%,.2f%n", balance);

            System.out.print("Enter amount (0 to stop): ");
            amount = sc.nextDouble();
        }
    }
}
