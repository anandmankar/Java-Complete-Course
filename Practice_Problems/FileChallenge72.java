import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class FileChallenge72 {
    public static void main(String[] args) {
        try(Scanner sc = new Scanner(System.in)) {
            System.out.println("Enter the name of the file: ");
            String fileName = sc.next();

            try(FileReader reader = new FileReader(fileName)) {
                int read;
                while((read = reader.read()) != -1) {
                    System.out.println((char)read);
                }
            }
            catch(FileNotFoundException exception) {
                System.out.printf("File not found...");
            }
            catch(IOException exception) {
                System.out.println("exception....");
            }
        }
    }
}
