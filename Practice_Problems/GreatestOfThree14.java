
import java.util.Scanner;

public class GreatestOfThree14 {
    public static void main(String[] args) {
        try(Scanner sc = new Scanner(System.in)) {

            System.out.println("Enter three numbers: ");
            int a = sc.nextInt();
            int b = sc.nextInt();
            int c = sc.nextInt();

            if(a > b && a > c) {
                System.out.println("The a is greater...");
            }
            else if(b > c) {
                System.out.println("The b is greater....");
            }
            else {
                System.out.println("The c is greater....");
            }
        }
    }
}
