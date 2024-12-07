import java.util.Arrays;

public class ReverseAnArray {

    public static void main(String[] args) {
        int[] array = { 1, 2, 3, 4, 5, 7 };

        int start = 0, end = array.length - 1, temp;
        while (start < end) {
            temp = array[start];
            array[start] = array[end];
            array[end] = temp;

            start++;
            end--;
        }
        System.out.println(Arrays.toString(array));
    }
}
