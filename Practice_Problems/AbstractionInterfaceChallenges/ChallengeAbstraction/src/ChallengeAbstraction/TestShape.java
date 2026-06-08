package ChallengeAbstraction;
public class TestShape {
    public static void main() {
//        ChallengeAbstraction.Shape shape = new ChallengeAbstraction.Shape();
        Circle cir = new Circle(5);
        Square square = new Square(10.3);

        System.out.printf("Area of circle is %f\n", cir.calculateArea());
        System.out.printf("Area of ChallengeAbstraction.Square is %f\n", square.calculateArea());

    }
}
