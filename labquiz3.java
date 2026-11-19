import java.util.Scanner;

public class labquiz3  {
    public static void main(String[] args) {
        System.out.println("XYZ's Pizza Parlor");
        int bill;
        double pay;
        Scanner input = new Scanner(System.in);
        System.out.print("Initial Bill: ");
        bill = input.nextInt();
        double servicecharge = 0.12;
        double serviceCharge;
        serviceCharge = (servicecharge);
        double salestax = 0.07;
        double salesTax;
        salesTax =(salestax);
        double grossBill = (serviceCharge*bill)+(salesTax*bill)+bill;
        System.out.println("Gross Bill: "+ grossBill);
        System.out.print("Pay: ");
        pay = input.nextDouble();
        double change = (pay-grossBill);
        System.out.println("Change: "+ change);

    }
}
