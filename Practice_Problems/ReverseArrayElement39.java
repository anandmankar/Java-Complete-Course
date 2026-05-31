
import java.util.Scanner;

public class ReverseArrayElement39 {
    public static void main(String[] args) {
        try(Scanner sc = new Scanner(System.in)) {
            System.out.println("Enter size of array: ");
            int n = sc.nextInt();

            int[] arr = new int[n];

            for(int i = 0; i < n; i++) {
                arr[i] = sc.nextInt();
            }

            int left = 0;
            int right = n-1;

            while(left < right) {
                int a = arr[left];
                arr[left] = arr[right];
                arr[right] = a;
                left++;
                right--;
            }

            System.out.println("The reversed array: ");
            for(int i = 0; i < n; i++) {
                System.out.print(arr[i] + " ");
            }
        }
    }
}
