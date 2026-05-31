
import java.util.Scanner;

public class NumberGuessingGame51 {
    public static void main(String[] args) {
        System.out.println("Welcome to Number Guessing Game....");
        try (Scanner sc = new Scanner(System.in)) {
            int num;
            int maxLimit = 1000;
            int pass = (int)Math.round(Math.random() * maxLimit);
            int cnt = 1;
            do {
                System.out.println("" + maxLimit);
                num = sc.nextInt();
                if(num < pass) {
                    System.out.println("Your number is Smaller...");
                    cnt++;
                }
                else if(num > pass){
                    System.out.println("Your number is Greater...");
                    cnt++;
                }
                else {
                    System.out.println("You got it buddy... on Chance: " + cnt);
                }
            } while (pass != num);
        }

    }
}
