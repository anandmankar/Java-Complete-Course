
import java.util.Scanner;

public class MultiplicationTable53 {
    public static void main(String[] args) {
        try(Scanner sc = new Scanner(System.in)) {
            System.out.print("Please enter a number: ");
            int num = sc.nextInt();

            for(int i = 1; i <= 10; i++) {
                System.out.println(num + " * " + i + " = " + num*i );
            }
        }

    }
}
