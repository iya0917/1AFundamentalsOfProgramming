import java.util.Scanner;

public class Scanner3 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter NSAT score: ");
        double nsat = sc.nextDouble();

        System.out.print("Enter parents' monthly salary: ");
        double salary = sc.nextDouble();

        System.out.print("Enter entrance examination score: ");
        double entrance = sc.nextDouble();

        double average = (nsat + entrance) / 2;

        if (salary > 10000 || nsat < 90 || entrance < 85) {
            System.out.println("Application Rejected");
        } else if (salary <= 3500 && average >= 91) {
            System.out.println("Application Accepted");
        } else {
            System.out.println("Application for Further Study");
        }
    }}