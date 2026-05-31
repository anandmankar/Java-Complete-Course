
import java.util.Scanner;

public class PalindromeNumber28 {
    public static void main(String[] args) {
        try(Scanner sc = new Scanner(System.in)) {
            System.out.println("Enter a Number: ");
            int num = sc.nextInt();

            int rev = 0;
            int temp = num;

            while(num > 0) {
                rev = (rev * 10) + num % 10;
                num /= 10;
            }

            if(temp == rev) {
                System.out.println("The number is Palindrome...");
            }
            else {
                System.out.println("The number is not Palindrome...");
            }
        }
    }
}
