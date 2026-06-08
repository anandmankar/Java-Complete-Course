
public class CalculatorOverloading68 {

    public static int add(int a, int b) {
        return a + b;
    }

    public static double add(int a, double b) {
        return a + b;
    }

    public static int add(int a, int b, int c) {
        return a + b + c;
    }

    public static void main(String[] args) {
        int res = add(2, 5);
        System.out.println(res);

        double result = add(2, 2.5);
        System.out.println(result);

        int add = add(2,4, 4);
        System.out.println(add);
    }
}
