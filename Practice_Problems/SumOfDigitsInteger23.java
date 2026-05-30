
import java.util.Scanner;

public class SumOfDigitsInteger23 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a Number: ");
        int n = sc.nextInt();

        int sum = 0;

        while(n > 0) {
            sum += n % 10;
            n /= 10;
        }

        System.out.println("The sum of all digits is: " + sum);
    }
}
