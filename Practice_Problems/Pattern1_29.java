
import java.util.Scanner;

public class Pattern1_29 {
    public static void main(String[] args) {
        try(Scanner sc = new Scanner(System.in)) {
            System.out.println("Enter a Number: ");
            int n = sc.nextInt();

            int i = 0;
            while(i < n) {
                int j = 0;
                while(j <= i) {
                    System.out.print("* ");
                    j++;
                }
                System.out.println();
                i++;
            }
        }
    }
}
