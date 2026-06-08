import java.util.Scanner;

public class Exception70 {
    public static void main(String[] args) {
        try(Scanner sc = new Scanner(System.in)) {
            System.out.print("Enter first number: ");
            int a = sc.nextInt();

            System.out.print("Enter second number: ");
            int b = sc.nextInt();

            try {
                int res = a / b;
                System.out.printf("result is: %d", res);
            } 
            catch (ArithmeticException exception) {
                System.out.println("Divide by Zero, enter valid values...");
            }
        }
    }
}