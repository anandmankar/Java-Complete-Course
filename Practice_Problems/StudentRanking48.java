
import java.util.Scanner;

public class StudentRanking48 {
    public static void main(String[] args) {
        try(Scanner sc = new Scanner(System.in)) {
            System.out.println("Enter marks: ");
            int marks = sc.nextInt();

            if(marks > 80) {
                System.out.println("High");
            }
            else if(marks >= 50) {
                System.out.println("Moderate");
            }
            else {
                System.out.println("Low");
            }
        }
    }
}
