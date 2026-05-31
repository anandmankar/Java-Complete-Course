
import java.util.Scanner;

public class PalindromeRecursion61 {
    public static boolean isPalindrome(String str) {
        if(str.length() <= 1) {
            return true;
        }
        int lastPos = str.length() -1;
        if(str.charAt(0) != str.charAt(lastPos)) {
            return false;
        }

        String newStr = str.substring(1, lastPos);
        return isPalindrome(newStr);
    }

    public static void main(String[] args) {
        try(Scanner sc = new Scanner(System.in)) {
            System.out.println("Enter a string: ");
            String str = sc.next();

            System.out.println("Your string is " + ((isPalindrome(str) ? "Palindrome" : "Not Palindrome")));
        }
    }
}
