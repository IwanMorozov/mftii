import java.util.Arrays;


public class zz10 {
    public static int[] deleteNegative(int[] arr) {

        // неотрицательные элементов
        int count = 0;
        for (int num : arr) {
            if (num >= 0) {
                count++;
            }
        }

        //массив для хранения неотрицательных элементов
        int[] result = new int[count];
        int index = 0;

        // Заполняем
        for (int num : arr) {
            if (num >= 0) {
                result[index++] = num;
            }
        }

        return result;
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, -3, 4, -2, 2, -5};
        int[] result = deleteNegative(arr);
        System.out.println(Arrays.toString(result));
    }
}
