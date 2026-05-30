
import java.util.Scanner;

public class LCMNumber33 {

    public static int lcmNum(int a, int b) {
        int mini = Math.min(a, b);
        int pro = a * b;

        while(mini <= pro) {
            if(mini % a == 0 && mini % b == 0) {
                return mini;
            } 
            mini++;
        }

        return 0;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a Nummber: ");
        int a = sc.nextInt();
        System.out.println("Enter a second Number: ");
        int b = sc.nextInt();

        int res = lcmNum(a, b);
        System.out.println("the lcm is: " + res);

    }
}
