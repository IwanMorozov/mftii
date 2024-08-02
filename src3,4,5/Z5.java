public class Z5 {
    public static void main(String[] args){
        System.out.println(max3(5,7,7));//Пример 1
        System.out.println(max3(8,-1,4));//Пример 2
    }

    public static int max3(int x,int y, int z){
        if (x > y & x > z){
            return x;
        }else if(x < y & y>z){
            return y;
        }else {
            return z;
        }
    }
}
