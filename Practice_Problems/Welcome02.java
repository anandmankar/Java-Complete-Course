import java.util.Scanner;

public class Welcome02 {
    public static void main(String[] args) {
        try(Scanner sc = new Scanner(System.in)) {

            System.out.println("Please enter your name: ");
            String name = sc.nextLine();
            System.out.println("Welcome "+ name + " to the Coding World");
        }
        
    }
}
