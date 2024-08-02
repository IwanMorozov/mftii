public class Block4z5 {
    public static void main(String[] args){
        System.out.println(numLen(12567));
    }
    public static int numLen(long x){
        int count = 0;
        if (x == 0){
            return 1;
        }
        while (x != 0){
            x /= 10;
            count ++;
        }
        return count;
    }
}
