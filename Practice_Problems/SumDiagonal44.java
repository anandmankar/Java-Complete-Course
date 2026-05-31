
import java.util.Scanner;

public class SumDiagonal44 {

    public static long sumOfDiagonals(int[][] arr) {
        long leftSum = LeftsumOfDiagonals(arr);
        long rightSum = RightsumOfDiagonals(arr);
        long sum = leftSum + rightSum;

        if(arr.length % 2 != 0) {
            int ind = arr.length/2;
            sum -= arr[ind][ind];
        }

        return sum;
    }

    public static long LeftsumOfDiagonals(int[][] arr) {
        long sum = 0;
        int i = 0;
        while(i < arr.length) {
            sum += arr[i][i];
            i++;
        }
        return sum;
    }

    public static long RightsumOfDiagonals(int[][] arr) {
        long sum = 0;
        int i = 0;
        while(i < arr.length) {
            int col = arr.length - 1 - i;
            sum += arr[i][col];
            i++;
        }
        return sum;
    }

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

            long sum = sumOfDiagonals(arr);
            System.out.println("The sum of diagonals is: " + sum);
        }
    }
}
