public class Z7 {
    public static void main(String[] args){
        System.out.println(sum2(5,7)); //Пример 1
        System.out.println(sum2(8,-1)); //Пример 2
    }
    public static int sum2(int x,int y) {
        if (x + y >= 10 && x + y <= 19) {
            return 20;
        }
        else {
            return x + y;
        }
    }
}
