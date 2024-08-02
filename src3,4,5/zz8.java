import java.util.Arrays;


public class zz8 {
    public static int[] concat(int[] arr1, int[] arr2) {

        int[] result = new int[arr1.length + arr2.length];
        
        System.arraycopy(arr1, 0, result, 0, arr1.length);
        
        System.arraycopy(arr2, 0, result, arr1.length, arr2.length);

        return result;
    }

    public static void main(String[] args) {
        int[] arr1 = {1, 2, 3};
        int[] arr2 = {7, 8, 9};
        int[] result = concat(arr1, arr2);
        System.out.println(Arrays.toString(result));
    }
}
