
import java.util.Scanner;

public class SearchElement2D_42 {
    public static void main(String[] args) {
        try(Scanner sc = new Scanner(System.in)) {
            System.out.println("Enter number of rows: ");
            int n = sc.nextInt();

            System.out.println("Enter number of columns: ");
            int m = sc.nextInt();

            int[][] arr = new int[n][m];
            System.out.println("enter array element: ");

            for(int i = 0; i < n; i++) {
                for(int j = 0; j < m; j++) {
                    arr[i][j] = sc.nextInt();
                }
            }

            System.out.println("Enter element to search: ");
            int ele = sc.nextInt();

            for(int i = 0; i < n; i++) {
                for(int j = 0; j < m; j++) {
                    if(arr[i][j] == ele) {
                        System.out.println("Element found....");
                        return;
                    }
                }
            }
            System.out.println("Element not found....");
        }
    }
}
