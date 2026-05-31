
import java.util.Scanner;

public class AbsoluteValue47 {
    public static void main(String[] args) {
        try(Scanner sc = new Scanner(System.in)) {
            System.out.println("Enter a Number: ");
            int num = sc.nextInt();

            if(num < 0) {       
                System.out.println("The absolute number is: " + (-num));
            }
            else {
                System.out.println(num);
            }
        }
    }
}
