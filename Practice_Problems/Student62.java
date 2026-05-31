import java.util.Scanner;

public class Student62 {

    int age;
    String name;

    public Student62(int age, String name) {
        this.age = age;
        this.name = name;
    }

    @Override
    public String toString() {
        return "The name is: " + name + " and age is: " + age ;
    }

    public static void main(String[] args) {
        try(Scanner sc = new Scanner(System.in)) {
            String name = sc.next();
            int age = sc.nextInt();

            Student62 student = new Student62(age, name);
            System.out.println(student);
        }
    }
}
