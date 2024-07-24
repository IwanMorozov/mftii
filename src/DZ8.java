public class DZ8 {
    public static boolean isDivisor(int a, int b) {
        return (a != 0 && b % a == 0) || (b != 0 && a % b == 0);
    }
    public static void main(String[] args) {
        int a = 8;
        int b = 4;
        boolean result = isDivisor(a, b);
        System.out.println(result);
    }
}
