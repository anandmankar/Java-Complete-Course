import java.util.Scanner;

public class fibonacciRecursion60 {

    public static int fibonacci(int num) {
        if(num == 1) {
            return 0;
        }

        if(num == 2) {
            return 1;
        }

        return fibonacci(num-1) + fibonacci(num-2);
    }
    public static void main(String[] args) {
        try(Scanner sc = new Scanner(System.in)) {
            System.out.println("Enter a number: ");
            int num = sc.nextInt();

            for(int i = 1; i <= num; i++) {
                System.out.print(fibonacci(i) + " ");
            }
        }
    }
}
