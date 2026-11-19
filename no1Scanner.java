import java.util.Scanner;
    public class no1Scanner {
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            System.out.print("Enter number 1: ");
            int num = sc.nextInt();
            int highest = num, lowest = num;

            for (int i = 2; i <= 10; i++) {
                System.out.print("Enter number " + i + ": ");
                num = sc.nextInt();
                if (num > highest) highest = num;
                if (num < lowest) lowest = num;
            }
            System.out.println("Highest: " + highest);
            System.out.println("Lowest: " + lowest);
        }
    }
