public class MaxMinNumberInArray {

    public static void main(String[] args) {
        int[] arr = { 1, 2, 3, 4, 5, 0, 34, 5667, -1 };
        System.out.println("maximum - " + max(arr));
        System.out.println("minimum - " + min(arr));
    }

    public static int max(int[] arr) {
        int max = arr[0];

        for (int a : arr) {
            if (max < a) {
                max = a;
            }
        }
        return max;
    }

    public static int min(int[] arr) {
        int min = arr[0];

        for (int a : arr) {
            if (min > a) {
                min = a;
            }
        }
        return min;
    }
}
