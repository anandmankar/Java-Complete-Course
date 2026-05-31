
import java.util.Arrays;
import java.util.Scanner;

public class MergeTwoSortedArray41 {

    public static int[] merge(int[] arr1, int[] arr2) {

        int n1 = arr1.length;
        int n2 = arr2.length;

        int[] merged = new int[n1 + n2];

        int i = 0, j = 0, k = 0;

        // Compare elements and merge
        while (i < n1 && j < n2) {

            if (arr1[i] <= arr2[j]) {
                merged[k] = arr1[i];
                i++;
            } else {
                merged[k] = arr2[j];
                j++;
            }
            k++;
        }

        // Copy remaining elements of arr1
        while (i < n1) {
            merged[k] = arr1[i];
            i++;
            k++;
        }

        // Copy remaining elements of arr2
        while (j < n2) {
            merged[k] = arr2[j];
            j++;
            k++;
        }

        return merged;
    }

    public static void main(String[] args) {
        try(Scanner sc = new Scanner(System.in)) {
            System.out.println("Enter first array size: ");
            int n = sc.nextInt();

            System.out.println("Enter second array size: ");
            int m = sc.nextInt();

            int[] arr1 = new int[n];
            int[] arr2 = new int[m];

            System.out.println("Enter first array elements: ");
            for(int i = 0; i < n; i++) {
                arr1[i] = sc.nextInt();        
            }

            System.out.println("Enter second array elements: ");
            for(int i = 0; i < m; i++) {
                arr2[i] = sc.nextInt();
            }

            int[] result = merge(arr1, arr2);
            System.out.println("Merged Array: " + Arrays.toString(result));
        }
    }
}
