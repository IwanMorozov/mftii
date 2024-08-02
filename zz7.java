import java.util.Arrays;

public class zz7 {
    public static int[] reverseBack(int[] arr) {
        int[] reversedArr = new int[arr.length];
        int j = 0;

        for (int i = arr.length - 1; i >= 0; i--) {
            reversedArr[j] = arr[i];
            j++;
        }

        return reversedArr;
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};
        int[] reversedArr = reverseBack(arr);
        System.out.println(Arrays.toString(reversedArr));
    }
}
