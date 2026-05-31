
import java.util.Scanner;

public class PrimeCheck54 {
    public static void main(String[] args) {
        try(Scanner sc = new Scanner(System.in)) {
            System.out.print("Enter a number: ");
            int num = sc.nextInt();

            int cnt = 0;

            for(int i = 1; i <= num; i++) {
                if(num % i == 0) {
                    cnt++;
                }
            }

            if(cnt == 2) {
                System.out.println("The number is Prime....");
            }
            else {
                System.out.println("The number is not Prime....");
            }
        }
    }
}
