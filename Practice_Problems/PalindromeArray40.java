
import java.util.Scanner;

public class PalindromeArray40 {

    public static boolean palindrome(int n, int[] arr) {
        int left = 0;
        int right = n-1;

        while(left < right) {
            if(arr[left] != arr[right]) {
                return false;
            }

            left++;
            right--;
        }

        return true;
    }

    public static void main(String[] args) {
        try(Scanner sc = new Scanner(System.in)) {
            System.out.println("Enter size of array: ");
            int n = sc.nextInt();

            int[] arr = new int[n];
            System.out.println("Enter array element: ");
            for(int i = 0; i < n; i++) {
                arr[i] = sc.nextInt();
            }

            if(palindrome(n, arr)) {
                System.out.println("The array is palindrome...");
            }
            else {
                System.out.println("The array is not palindrome...");
            }
        }
    }
}
