public class Z2 {
    public static void main(String[] args) {
        System.out.println(safeDiv(5, 0));  // Пример 1:  результат: 0
        System.out.println(safeDiv(8, 2));  // Пример 2:  результат: 4
    }

    public static int safeDiv(int x, int y) {
        if (y == 0) {
            return 0;
        } else {
            return x / y;
        }
    }
}
