
import java.util.Scanner;

public class EvenOddBitwise19 {
    public static void main(String[] args) {
        try(Scanner sc = new Scanner(System.in)) {
            System.out.println("Enter a number: ");
            int a = sc.nextInt();

            if((a & 1) == 0) {
                System.out.println("The number is Even...");
            }
            else {
                System.out.println("The number is Odd...");
            }
        }
    }
}
