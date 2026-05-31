import java.util.Scanner;

public class Addition03 {
    public static void main(String[] args) {
        try(Scanner sc = new Scanner(System.in)) {
            System.out.print("Enter a Number: ");
            int a = sc.nextInt();
            System.out.print("Enter a Number: ");
            int b = sc.nextInt();
            System.out.println("The addition of two number is: " + (a+b));
        }
    }
}
