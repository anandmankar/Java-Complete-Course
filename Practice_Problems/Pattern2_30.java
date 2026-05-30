
import java.util.Scanner;

public class Pattern2_30 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a Number: ");
        int n = sc.nextInt();

        while(n > 0) {
            int j = n;
            while(j > 0) {
                System.out.print("* ");
                j--;
            }
            System.out.println();
            n--;
        }
    }
}
