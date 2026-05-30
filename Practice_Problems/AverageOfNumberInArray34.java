
import java.util.Scanner;

public class AverageOfNumberInArray34 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter array size: ");
        int n = sc.nextInt();

        int[] arr = new int[n];
        int i = 0;
        int sum = 0;
        while(i < n) {
            arr[i] = sc.nextInt();
            sum += arr[i];
            i++;
        }

        int average = sum / arr.length;

        System.out.println("The sum of elements in array is: " + sum + " and average is: " + average);

    }
}
