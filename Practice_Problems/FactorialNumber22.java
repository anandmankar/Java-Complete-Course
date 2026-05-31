import java.util.Scanner;

public class FactorialNumber22 {
    public static void main(String[] args) {
        try(Scanner sc = new Scanner(System.in)) {

            System.out.println("Enter a Number: ");
            int num = sc.nextInt();

            int fact = 1;
            int i = 1;

            while(i <= num) {
                fact *= i;
                i++;
            }

            System.out.println("The factorial of a Number is: " + fact);
        }
    }
}
