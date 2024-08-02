public class Z9 {
    public static void main(String[] args){
        System.out.println(magic6(5,7));//Пример 1
        System.out.println(magic6(8,2));// Пример 2
        System.out.println(magic6(1,6));// Пример 3
    }
    public static boolean magic6(int x,int y){
        if (x == 6 || y == 6 ){
            return true;
        }else return x + y == 6 || x - y == 6 || y - x == 6;
    }
}
