import java.util.Scanner;

public class ProductFloat06 {
    public static void main(String[] args) {
        try(Scanner sc = new Scanner(System.in)) {
            System.out.println("Please Enter two Floating point Numbers: ");
            float a = sc.nextFloat();
            float b = sc.nextFloat();

            double ans = a * b;

            System.out.println("The Product of two Floating Point Number is: " + ans);
        }
    }
}
