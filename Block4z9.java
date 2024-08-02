public class Block4z9 {
    public static void rightTriangle(int x) {
        for (int i = 1; i <= x; i++) {
            for (int j = 1; j <= x - i; j++) {
                System.out.print(" ");
            }
            for (int k = 1; k <= i; k++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        int size1 = 3;// 1
        rightTriangle(size1);
        int size2 = 4;//2
        rightTriangle(size2);
    }
}
