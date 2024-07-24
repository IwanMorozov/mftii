public class DZ5 {
    public static boolean is2Digits(int x) {
        return x >= 10 && x < 100 || x <= -10 && x > -100;
    }
    public static void main(String[] args) {
        int x = 32;
        boolean result = is2Digits(x);
        System.out.println(result);
    }
}
