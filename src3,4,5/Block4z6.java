public class Block4z6{
    public static void main(String[] args){
        System.out.println(equalNum(1111));// Пример 1
        System.out.println(equalNum(1211));// Пример 2
}
    public static boolean equalNum(int x){
        int lastD = x % 10;
        while (x != 0){
            int digit = x % 10;
            if (digit != lastD){
                return false;
            }
            x /= 10;
        }
        return true;
    }
}