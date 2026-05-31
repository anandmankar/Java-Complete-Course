
import java.util.Scanner;

public class Pattern3_31 {
    public static void main(String[] args) {
        try(Scanner sc = new Scanner(System.in)) {

            System.out.println("Enter a Number: ");
            int n = sc.nextInt();

            int i = 0;
            while(i < n) {
                // for space
                int j = n-i-1;
                while(j > 0) {
                    System.out.print("  ");
                    j--;
                }

                // for stars
                int k = i+1;
                while(k > 0) {
                    System.out.print("* ");
                    k--;
                }

                System.out.println();

                i++;
            }
        }
    }
}
