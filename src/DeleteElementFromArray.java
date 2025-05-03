import java.util.Arrays;

public class DeleteElementFromArray {
    public static void main(String[] args) {
        int[] arr = { 6, 3, 1, 5, 3, 2 };
        int[] wr = new int[arr.length - 1];
        int index = 3;

        for (int i = 0, j = 0; i < arr.length; i++) {
            if (i == index)
                continue;
            wr[j++] = arr[i];
        }
        System.out.println(Arrays.toString(wr));
    }
}
