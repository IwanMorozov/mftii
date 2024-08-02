public class Z1 {
    public static void main(String[] args) {
        System.out.println(abs(5));  // Пример 1: x = 5, результат: 5
        System.out.println(abs(-3)); // Пример 2: x = -3, результат: 3
    }

    public static int abs(int x) {
        if (x < 0) {
            return -x;
        } else {
            return x;
        }
    }
}