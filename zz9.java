import java.util.Arrays;


public class zz9 {
    public static int[] findAll(int[] arr, int x) {

        int count = 0;
        for (int num : arr) {
            if (num == x) {
                count++;
            }
        }

        //массив для хранения индексов
        int[] indices = new int[count];
        int index = 0;

        // Заполняем массив индексов
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == x) {
                indices[index++] = i;
            }
        }

        return indices;
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 8, 2, 2, 9};
        int x = 2;
        int[] result = findAll(arr, x);
        System.out.println(Arrays.toString(result)); // Output: [1, 4, 5]
    }
}
