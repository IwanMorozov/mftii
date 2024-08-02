public class Z6 {
    public static boolean sum3(int x,int y, int z){
        if (x + y == z || z + y == x || x + z == y ){
            return true;
        }else {
            return false;
        }
    }


    public static void main(String[] args){
        System.out.println(sum3(5,7,2));//пример1
        System.out.println(sum3(8,-1,4));//пример 2
    }
    }

