
import java.util.Scanner;

public class ArmstrongNumber27 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int temp = n;
        int cnt = 0;
        while(temp > 0) {
            temp /= 10;
            cnt++;
        }

        temp = n;

        int sum = 0;
        while(temp > 0) {
            int dig = temp % 10;
            sum += Math.pow(dig, cnt);
            temp /= 10;
        }

        if(sum == n) {
            System.out.println("The number is Armstrong Number....");
        }
        else {
            System.out.println("The number is not Armstrong Number....");
        }
            
    }
}
