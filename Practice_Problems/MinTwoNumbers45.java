
import java.util.Scanner;

public class MinTwoNumbers45 {
    public static void main(String[] args) {
        Scanner sc = new Scanner((System.in));
        System.out.println("Enter first number: ");
        int a = sc.nextInt();

        System.out.println("Enter second number: ");
        int b = sc.nextInt();

        int mini = a < b ? a : b;
        System.out.println("The minimum number between a and b is: " + mini);
    }
}
