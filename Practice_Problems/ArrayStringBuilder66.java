import java.util.Scanner;

public class ArrayStringBuilder66 {
    public static void main(String[] args) {
        try(Scanner sc = new Scanner(System.in)) {
            System.out.print("Enter size of array: ");
            int n = sc.nextInt();

            String[] arr = new String[n];

            System.out.print("Enter array elements: ");
            for(int i = 0; i < n; i++) {
                arr[i] = sc.next();
            }

            StringBuilder sb = new StringBuilder();

            for (String elem : arr) {
                sb.append(elem).append(" ");
            }

            System.out.println(sb);
        }
    }
}
