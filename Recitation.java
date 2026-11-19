import java.util.Scanner;

public class Recitation {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the number of rows: ");

        int n = input.nextInt();

        for (int row = 1; row <= n; row++) ;
        {
            for (int space = 1; space <= n-1; space++) {
                System.out.print(" ");
            }
            for (int star = 1; star <= n - n; star++) {
                System.out.println("# ");
            }
            System.out.println();

        }
    }
}