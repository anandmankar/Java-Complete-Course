
import java.util.Scanner;

public class AverageSum2D_43 {
    public static void main(String[] args) {
        try(Scanner sc = new Scanner(System.in)) {
            System.out.println("Enter number of rows: ");
            int n = sc.nextInt();

            System.out.println("Enter number of columns: ");
            int m = sc.nextInt();

            int[][] arr = new int[n][m];
            System.out.println("Enter array elements: ");

            for(int i = 0; i < n; i++) {
                for(int j = 0; j < m; j++) {
                    arr[i][j] = sc.nextInt();
                }
            }

            int sum = 0;
            for(int i = 0; i < n; i++) {
                for(int j = 0; j < m; j++) {
                    sum += arr[i][j];
                }
            }

            System.out.println("The sum of array elements is: " +  sum);

            int average = sum / (n*m);
            System.out.println("The average of array elements is: " + average);
        }
    }
}
