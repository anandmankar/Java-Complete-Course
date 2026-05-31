
import java.util.Scanner;

public class reverseDigitsOfNumber25 {
    public static void main(String[] args) {
        try(Scanner sc = new Scanner(System.in)) {

            System.out.println("Enter a Number: ");
            int n = sc.nextInt();

            int rev = 0;
            while(n > 0) {
                rev = (rev * 10) + n % 10;
                n /= 10;
            }

            System.out.println("The reverse number is: " + rev);
        }
    }
}
