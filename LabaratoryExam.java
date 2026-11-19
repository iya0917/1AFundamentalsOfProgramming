import java.util.*;
import java.text.DecimalFormat;
import java.util.Scanner;



public class LabaratoryExam {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        DecimalFormat dc = new DecimalFormat("0.00");
        System.out.print("Customer Name: ");
        String name = sc.nextLine();
        System.out.print("Units Consumed: ");
        int unitsConsumed = sc.nextInt();

        double Bill = 0;
        if (unitsConsumed <= 100) {
            Bill = 5*unitsConsumed;
            System.out.println("Basic Bill: " + dc.format(Bill));
        }
        else if (unitsConsumed <= 200) {
            Bill = 6.00*unitsConsumed;
            System.out.println("Basic Bill: " +  dc.format(Bill));
        }
        else if (unitsConsumed <= 300) {
            Bill = 7.00*unitsConsumed;
            System.out.println("Basic Bill: " +  dc.format(Bill));
        }
        else if (unitsConsumed >= 301) {
            Bill = 8.00*unitsConsumed;
            System.out.println("Basic Bill: " +  dc.format(Bill));

            if (Bill>=2800){
                double surcharge= Bill*0.05;
                System.out.println("Surcharge Applied: " + dc.format(surcharge));


        }


        }
    }

}