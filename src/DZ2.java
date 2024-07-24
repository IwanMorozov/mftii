public class DZ2 {
    public static void main(String[] args) {
        double x = 5.25;
        double result = fraction(x);
        System.out.println("Результат: " + result);
    }

    public static double fraction(double x) {
        return x - Math.floor(x);
    }
}