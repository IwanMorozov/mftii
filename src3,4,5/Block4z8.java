public class Block4z8 {
    public static void leftTriangle(int x) {
        for (int i = 0; i <= x; i++) {
            for (int j = 0; j < i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        int size1 = 2;// 1
        leftTriangle(size1);
        int size2 = 4;//2
        leftTriangle(size2);
    }
}
