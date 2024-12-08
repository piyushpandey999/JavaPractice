public class SortAnArray {

    public static void sortArrayinAscendingOrder() {
        int[] arr = { 5, 2, 8, 1, 9 };
        int len = arr.length;

        int temp = 0;

        for (int i = 0; i < len; i++) {
            for (int j = i + 1; j < len; j++) {
                if (arr[i] > arr[j]) {
                    temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }

        for (int k = 0; k < len; k++) {
            System.out.print(arr[k] + " ");
        }
    }
    public static void sortArrayinDescendingOrder() {
        int[] arr = { 5, 2, 8, 1, 9 };
        int len = arr.length;

        int temp = 0;

        for (int i = 0; i < len; i++) {
            for (int j = i + 1; j < len; j++) {
                if (arr[i] < arr[j]) {
                    temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }

        for (int k = 0; k < len; k++) {
            System.out.print(arr[k] + " ");
        }
    }

    public static void main(String[] args) {
        System.out.println("Array in ascending order");
        sortArrayinAscendingOrder();
        System.out.println("Array in descending order");
        sortArrayinDescendingOrder();
    }
}
