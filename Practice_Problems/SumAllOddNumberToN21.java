
import java.util.Scanner;

public class SumAllOddNumberToN21 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a Number N: ");
        int n = sc.nextInt();

        int sum = 0;

        int i = 1;
        while(i <= n) {
            if(i % 2 == 1) {
                sum += i;
                i++;
            }
            i++;
        }

        System.out.println("The sum of all odd numbers from 1 to N is: " + sum);

        
    }
}
