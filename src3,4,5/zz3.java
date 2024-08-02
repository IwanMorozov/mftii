public class zz3 {
    public static void main(String[] args){
        int[]arr = {1,-2,-7,4,2,2,5};
        int result = maxAbs(arr);
        System.out.println(result);
    }
    public static int maxAbs(int[] arr){
        int maxAbsValue = arr[0];
        for (int i = 1;i < arr.length;i ++){
            if(Math.abs(arr[i]) > Math.abs(maxAbsValue)){
                maxAbsValue = arr[i];
            }

        }
        return maxAbsValue;
    }
}
