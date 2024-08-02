public class Block4z4 {
    public static void main(String[] args){
        System.out.println(pow(2,5));
    }
    public static int pow(int x, int y){
        int result = 1;
        for (int i = 0 ; i < y ; i++){
            result *= x;
        }
        return result;
    }
}
