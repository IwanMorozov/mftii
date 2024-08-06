public class Z3 {
    public static void main(String[] args) {
        System.out.println(max(5, 7));  // П1: результат: 0
        System.out.println(max(8, -1));  // П2: результат: 4
    }

    public static int max(int x, int y) {
        if (x > y) {
            return x;
        } else  {
            return y;
        }
    }
}
