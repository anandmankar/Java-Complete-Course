
import java.util.Scanner;

public class FahrenheitToCelcius11 {
    public static void main(String[] args) {
        try(Scanner sc = new Scanner(System.in)) {

            System.out.println("Enter temperature in fahrenheit: ");
            int f = sc.nextInt();

            int c = (f-32) * 5/9;
            System.out.println("Temperature in Celcius: " + c);

            sc.close();
        }
    }
}