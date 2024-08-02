public class zz4 {
    public static void main(String[] args){
        int[] arr = {1,-2,-7,4,2,2,5};
        System.out.println(countPositive(arr));
    }
    public static int countPositive(int[] arr){
        int count = 0;
        for (int num : arr){
            if (num > 0){
                count ++;
            }
        }
        return count;
    }
}
