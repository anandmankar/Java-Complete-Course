import java.util.Scanner;

public class OccrencesOfElement56 {
    public static void main(String[] args) {
        try(Scanner sc = new Scanner(System.in)) {
            System.out.println("Enter size of array: ");
            int n = sc.nextInt();

            int[] arr = new int[n];

            for(int i = 0; i < n; i++) {
                arr[i] = sc.nextInt();
            }

            System.out.println("Enter number to find occurences of the number: ");
            int num = sc.nextInt();

            int cnt = 0;

            for(int it: arr) {
                if(it == num) {
                    cnt++;
                }
            }

            System.out.println("The occrences of the number in array is: "+ cnt);
        }
    }
}
