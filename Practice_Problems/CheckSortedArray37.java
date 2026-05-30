
import java.util.Scanner;

public class CheckSortedArray37 {

    public static boolean sortedArray(int size, int[] arr) {
        for(int i = 0; i < size-1; i++) {
            if(arr[i] > arr[i+1]) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter size of array: ");
        int size = sc.nextInt();

        int[] arr = new int[size];
        System.out.println("Enter array elements: ");
        for(int i = 0; i < size; i++) {
            arr[i] = sc.nextInt();
        }

        if(sortedArray(size, arr)) {
            System.out.println("The array is sorted...");
        }
        else {
            System.out.println("The array is not sorted...");
        }
    }
}
