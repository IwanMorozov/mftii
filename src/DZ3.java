public class DZ3 {
    public static int charToNum(char x) {
        return x - '0';
    }
    public static void main(String[] args) {
        char x = '3';
        int result = charToNum(x);
        System.out.println(result);
    }
}