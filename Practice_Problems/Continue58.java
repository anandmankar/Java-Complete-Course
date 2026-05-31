
import java.util.Scanner;

public class Continue58 {
    public static void main(String[] args) {
        try(Scanner sc = new Scanner(System.in)) {
            System.out.println("Enter size of the array: ");
            int n = sc.nextInt();

            int[] arr = new int[n];

            for(int i = 0; i < n; i++) {
                arr[i] = sc.nextInt();
            }

            int sum = 0;
            for(int i = 0; i < n; i++) {
                if(arr[i] < 0) {
                    continue;
                }
                sum += arr[i];
            }

            System.out.println("The sum is: " + sum);
        }
    }
}