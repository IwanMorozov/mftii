public class DZ7 {
    public static boolean isInRange(int a, int b, int num) {
        int lower = Math.min(a, b);
        int upper = Math.max(a, b);
        return num >= lower && num <= upper;
    }
    public static void main(String[] args) {
        int a = 5;
        int b = 1;
        int num = 3;
        boolean result = isInRange(a, b, num);
        System.out.println(result);
    }
}
