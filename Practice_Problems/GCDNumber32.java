
import java.util.Scanner;

public class GCDNumber32 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a Number: ");
        int a = sc.nextInt();
        System.out.println("Enter a second number: ");
        int b = sc.nextInt();

        int maxiNum = Math.max(a, b);

        while(maxiNum > 0) {
            if(a % maxiNum == 0 && b % maxiNum == 0) {
                System.out.println("The gcd number is: " + maxiNum);
                return;
            }
            maxiNum--;
        }
    }
}