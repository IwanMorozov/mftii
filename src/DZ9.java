public class DZ9 {
    public static boolean isEqual(int a, int b, int c) {
        return a == b && b == c;
    }
    public static void main(String[] args) {
        int a = 2;
        int b = 2;
        int c = 2;
        boolean result = isEqual(a, b, c);
        System.out.println(result);
    }
}
