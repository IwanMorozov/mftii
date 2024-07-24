public class DZ6 {
    public static boolean isUpperCase(char x) {
        return x >= 'A' && x <= 'Z';
    }
    public static void main(String[] args) {
        char x = 'W';
        boolean result = isUpperCase(x);
        System.out.println(result);
    }
}
