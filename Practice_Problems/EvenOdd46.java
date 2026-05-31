
import java.util.Scanner;

public class EvenOdd46 {
    public static void main(String[] args) {
        try(Scanner sc = new Scanner(System.in)) {
            System.out.println("Enter a Number: ");
            int num = sc.nextInt();

            String res = (num % 2 == 0) ? "Even Number..." : "Odd Number....";
            System.out.println(res);
        }
    }
}
