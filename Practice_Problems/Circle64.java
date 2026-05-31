import java.util.Scanner;

public class Circle64 {

    double radiusInMm;

    public Circle64(double radiusInMm) {
        this.radiusInMm = radiusInMm;
    }

    double getCircumference() {
        return 2 * radiusInMm * Math.PI;
    }

    double getArea() {
        return Math.PI * Math.pow(radiusInMm, 2);
    }

    @Override
    public String toString() {
        return "Circle Props: " +
           "Radius in mm: " + radiusInMm + "\n" +
           "Circumference in mm: " + getCircumference() + "\n" +
           "Area in mm²: " + getArea();
    }

    
    public static void main(String[] args) {
        try(Scanner sc = new Scanner(System.in)) {
            System.out.println("Enter radius: ");
            double radius = sc.nextDouble();

            Circle64 c = new Circle64(radius);
            System.out.println(c);
        }
    }
}
