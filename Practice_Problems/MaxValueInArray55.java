
import java.util.Scanner;

public class MaxValueInArray55 {
    public static void main(String[] args) {
        try(Scanner sc = new Scanner(System.in)) {
            System.out.print("Enter size of array: ");
            int size = sc.nextInt();

            int[] arr = new int[size];

            for(int i = 0; i < size; i++) {
                arr[i] = sc.nextInt();
            }

            int maxi = Integer.MIN_VALUE;
            for(int it: arr) {
                if(it > maxi) {
                    maxi = it;
                }
            }

            System.out.println("The maximum number in array is: " + maxi);
        }
    }
}
