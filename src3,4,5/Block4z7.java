public class Block4z7 {
    public static void square(int x) {
        for (int i = 0; i < x; i++) {
            for (int j = 0; j < x; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        int size1 = 2;
        square(size1);
        int size2 = 4;
        square(size2);
    }
    }
