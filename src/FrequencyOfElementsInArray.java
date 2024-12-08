import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class FrequencyOfElementsInArray {

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 3, 4, 4, 9, 7, 8, 9};
        HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
        for (int i = 0; i < arr.length; i++) {
            if (map.containsKey(arr[i])) {
                map.put(arr[i], map.get(arr[i]) + 1);
            } else {
                map.put(arr[i], 1);
            }
        }
        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
            System.out.println(entry.getKey() + "=" + entry.getValue());
        }

        // Print duplicate elements in the array ---------------------------
        Set<Integer> set = map.keySet();
        for (int i : set) {
            if (map.get(i) > 1) {
                System.out.println(i + "-->" + map.get(i));
            }
        }

        reverseArray(arr);
    }

    public static void reverseArray(int[] array) {
        for (int i = array.length - 1; i >= 0; i--) {
            System.out.print(array[i]);
        }
    }
}
