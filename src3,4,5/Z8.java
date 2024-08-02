public class Z8 {
    public static void main(String[] args){
        System.out.println(is35(5));//Пример 1
        System.out.println(is35(8));//Пример 2
        System.out.println(is35(15));//Пример 3
    }
    public static boolean is35(int x){
        if (x % 3 == 0 && x % 5 == 0) {
            return false;
        }else if (x % 3 == 0 || x % 5 == 0){
            return true;
        }else {
            return false;
        }
    }
}
