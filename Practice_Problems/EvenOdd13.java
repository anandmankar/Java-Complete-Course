
import java.util.Scanner;

public class EvenOdd13 {
    public static void main(String[] args) {
        try(Scanner sc = new Scanner(System.in)) {
            System.out.println("Enter a Number to check whether even or odd...: ");
            int num = sc.nextInt();

            if(num % 2 == 0) {
                System.out.println("The number is Even...");
            }
            else {
                System.out.println("The number is Odd...");
            }
        }
    }
}
