public class DZ10 {
        public static void main(String[] args) {
            int result = lastNumSum(
                    lastNumSum(
                            lastNumSum(
                                    lastNumSum(5, 11), 123), 14), 1);
            System.out.println(result); // Вывод: 4
        }

        public static int lastNumSum(int a, int b) {
            return (a % 10) + (b % 10);
        }
}
