
import java.util.Scanner;

public class SimpleInterest09 {
    public static void main(String[] args) {
        try(Scanner sc = new Scanner(System.in)) {

            System.out.println("Enter P, T and R amount: ");
            int p = sc.nextInt();
            int t = sc.nextInt();
            int r = sc.nextInt();

            int si = (p*t*r) / 100;
            System.out.println("The simple Interest is: " + si);
        }
    }
}
