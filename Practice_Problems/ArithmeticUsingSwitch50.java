import java.util.Scanner;

public class ArithmeticUsingSwitch50 {
    public static void main(String[] args) {
        try(Scanner sc = new Scanner(System.in)) {
            System.out.println("Enter a symbol: ");
            String str = sc.next();

            System.out.println("Enter num1: ");
            int num1 = sc.nextInt();
            System.out.println("Enter num2: ");
            int num2 = sc.nextInt();

            switch (str) {
                case "+" -> System.out.println("addition: " + (num1 + num2));
                
                case "-" -> System.out.println("subtraction: " + (num1 - num2));

                case "*" -> System.out.println("multiplication: " + (num1 * num2));

                case "/" -> System.out.println("division: " + (num1 / num2));

                default -> System.out.println("Invalid Symbol... Enter valid symbol...");
            }
        }
    }
}
