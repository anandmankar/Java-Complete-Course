import java.util.Scanner;

public class BitewiseOperator18{
    public static void main(String[] args) {
        try(Scanner sc = new Scanner(System.in)) {
            System.out.println("enter two numbers: ");
            int a = sc.nextInt();
            int b = sc.nextInt();

            int resAnd = a & b;
            System.out.println("The Bitwise and result is: " + resAnd);

            int resOr = a | b;
            System.out.println("The Bitwise Or result is: " + resOr);

            int resXor = a ^ b;
            System.out.println("The Bitwise Xor result is: " + resXor);

            int resComp = ~a;
            System.out.println("The Bitwise Complement result is: " + resComp);

            int resLeftShift = a << 2;
            System.out.println("The Bitwise left shift result is: " + resLeftShift);

            int resRightShift = a >> 2;
            System.out.println("The Bitwise right sift result is: " + resRightShift);
        }
    }
}
