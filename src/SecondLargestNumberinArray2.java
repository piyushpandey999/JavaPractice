import java.util.Arrays;
import java.util.Collections;


public class SecondLargestNumberinArray2 {
    public static void main(String[] args) {
       Integer[] array = {5,5,6,3,7,8,3,1};
       int[] arr = {3,44,4,8,3,9,10};
//        Arrays.sort(array, Collections.reverseOrder());
//        for (int i=1;i<array.length;i++) {
//            if (array[i] != array[0]){
//                System.out.println("second largest number in array is " + array[i]);
//                return;
//            }
//        }

        System.out.println("second largest number in array is " + getSecondLargest(arr,arr.length));
    }

    public static int getSecondLargest(int[] arr , int length) {
        Arrays.sort(arr);
        return arr[length - 2];
    }
}
