
import java.util.Scanner;

public class NumberOfOccurance35 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a size: ");
        int size = sc.nextInt();

        int[] arr = new int[size];
        int i = 0;
        while(i < size) {
            arr[i] = sc.nextInt();
            i++;
        } 

        System.out.println("Enter number to find occurrences: ");
        int num = sc.nextInt();

        int cnt = 0;
        int j = 0;
        while(j < size) {
            if(arr[j] == num) {
                cnt++;
                j++;
            }
            j++;
        }

        System.out.println("The number of Occurrences are: " + cnt);
    }
}
