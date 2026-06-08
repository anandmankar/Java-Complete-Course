
import java.util.Scanner;

public class ExceptionChallenge71 {
    public static void main(String[] args) {
        try(Scanner sc = new Scanner(System.in)) {
            System.out.print("Enter a number: ");
            int a = sc.nextInt();
            System.out.print("Enter a number: ");
            int b = sc.nextInt();

            try {
                int res = a / b;
                System.out.println("The result is: "+ res);
            } 
            catch (ArithmeticException exception) {
                if(exception.getMessage().equals("/ by zero")) {
                    System.out.println("Division by Zero Exception occurred...");
                }
                else {
                    throw exception;
                }
            }
            finally {
                System.out.println("Finally..");
            }
        }
    }
}
