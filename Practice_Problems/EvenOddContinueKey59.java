import java.util.Scanner;

public class EvenOddContinueKey59 {
    public static void main(String[] args) {
        try(Scanner sc = new Scanner(System.in)) {
            System.out.println("Enter size of array: ");
            int n = sc.nextInt();

            int[] arr = new int[n];

            for(int i = 0; i < n; i++) {
                arr[i] = sc.nextInt();
            }

            for(int i = 0; i < n; i++) {
                if(arr[i] % 2 != 0) {
                    continue;
                }
                System.out.print(arr[i] + " ");
            }
        }
    }
}
