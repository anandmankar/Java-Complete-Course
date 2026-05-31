
import java.util.Scanner;

public class AreaTriangle08 {
    public static void main(String[] args) {
        try(Scanner sc = new Scanner(System.in)) {
            System.out.println("Enter breadth: ");
            int b = sc.nextInt();

            System.out.println("Enter height: ");
            int h = sc.nextInt();

            double areaTriangle = 0.5 * b * h;
            System.out.println("Area of Rectangle is: " + areaTriangle);
        }
    }
}
