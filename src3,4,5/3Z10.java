public class Z10 {
    public static void main(String[] args){
        System.out.println(age(5));//Пример1
        System.out.println(age(31));//Пример1
        System.out.println(age(44));//Пример1
    }
    public static String age(int x){
        if (x % 10 == 1 && x != 11){
            return x + " " + "год";
        }else if ((x % 10 == 2 || x % 10 == 3 || x % 10 == 4) && !(x >= 12 && x <= 14)){
             return x + " " + "года";
        }else {
            return x + " " + "лет";
        }
    }
}
