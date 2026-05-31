
import java.util.Scanner;

public class FibonacciSeries26 {
    public static void main(String[] args) {
        try(Scanner sc = new Scanner(System.in)) {
            System.out.println("Enter a number: ");
            int n = sc.nextInt();

            int a = 0;
            int b = 1;
            System.out.print(a + " ");
            System.out.print(b + " ");

            while(n >= 0) {
                int temp = a + b;
                System.out.print(temp + " ");
                a = b;
                b = temp;
                n--;
            }
        }

    }
}
