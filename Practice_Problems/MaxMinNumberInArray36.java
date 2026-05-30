
import java.util.Scanner;

public class MaxMinNumberInArray36 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("enter size of array: ");
        int size = sc.nextInt();

        int[] arr = new int[size];
        System.out.println("Enter array elements: ");
        int i = 0;
        while(i < size) {
            arr[i] = sc.nextInt();
            i++;
        }

        int mini = arr[0];
        int maxi = arr[0];

        for(int j = 0; j < size; j++) {
            if(arr[j] < mini) {
                mini = arr[j];
            }

            if(arr[j] > maxi) {
                maxi = arr[j];
            }
        }

        System.out.println("The minimum number in array is: " + mini);
        System.out.println("The maximum number in array is: " + maxi);
    }
}
