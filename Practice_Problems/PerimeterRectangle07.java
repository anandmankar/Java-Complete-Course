
import java.util.Scanner;

public class PerimeterRectangle07 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Side 1: ");
        int a = sc.nextInt();

        System.out.print("Enter side 2: ");
        int b = sc.nextInt();

        System.out.print("Enter side 3: "); 
        int c = sc.nextInt();

        System.out.print("Enter side 4: ");
        int d = sc.nextInt();

        int perimeter = a + b + c + d;
        System.out.println("The perimeter of Rectangle is: " + perimeter);
    }
}