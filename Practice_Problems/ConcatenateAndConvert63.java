
import java.util.Scanner;

public class ConcatenateAndConvert63 {
    public static void main(String[] args) {
        try(Scanner sc = new Scanner(System.in)) {
            System.out.println("Enter two Strings: ");
            String str1 = sc.next();
            String str2 = sc.next();

            String res = str1 +" "+ str2;
            System.out.println("The string after concatenation: "+ res);

            System.out.println("The uppercase String: " + res.toUpperCase());
        }
    }
}
