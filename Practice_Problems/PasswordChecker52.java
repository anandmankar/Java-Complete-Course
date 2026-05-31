import java.util.Scanner;

public class PasswordChecker52 {
    public static void main(String[] args) {
        try(Scanner sc = new Scanner(System.in)) {
            System.out.println("Welcome to Password Checker.");

            String password;
            do { 
                System.out.print("Enter a password: ");
                password = sc.next();
            } while (password.length() < 8);
            System.out.println("Thanks for entering the valid password....");
        }
    }
}
