import java.util.Scanner;

public class BreakKeyword57 {
    public static void main(String[] args) {
        try(Scanner sc = new Scanner(System.in)) {

            while(true) {
                System.out.print("Enter a string: ");
                String str = sc.next();
                if(str.equals("exit")) {
                    break;
                }
                else {
                    System.out.println("You entered " + str);
                }
            }

            System.out.println("Successfully exit...");

        }
    }
}
