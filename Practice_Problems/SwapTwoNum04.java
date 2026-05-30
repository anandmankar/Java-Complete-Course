import java.util.Scanner;
public class SwapTwoNum04 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter two Numbers: ");
        int a = sc.nextInt();
        int b = sc.nextInt();

        System.out.println("Before Swapping: " + a + " " + b);
        
        int temp = a;
        a = b;
        b = temp;

        System.out.println("After Swapping: " + a + " " + b);
    }
}