
import java.util.Scanner;

public class PrimeNumber24 {
    public static void main(String[] args) {
        try(Scanner sc = new Scanner(System.in)) {

            System.out.println("Enter a Number: ");
            int n = sc.nextInt();

            int cnt = 1;
            int i = 2;

            while(i <= n) {
                if(n % i == 0) {
                    cnt++;
                    i++;
                }
                i++;
            }

            if(cnt == 2) {
                System.out.println("The number is Prime...");
            }
            else {
                System.out.println("The number is not Prime...");
            }
        }
    }
}
