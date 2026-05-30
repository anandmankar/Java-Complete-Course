
import java.util.Scanner;

public class CompoundInterest10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter Principle: ");
        int p = sc.nextInt();

        System.out.println("Enter Time: ");
        int t = sc.nextInt();

        System.out.println("Enter Rate: ");
        int r = sc.nextInt();

        double amount = p * Math.pow((1 + (r / 100.0)), t);
        double ci = amount - p;
        
        System.out.println("The compound interest is: " + ci);
    } 
}
