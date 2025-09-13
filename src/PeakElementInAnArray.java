import java.util.ArrayList;
import java.util.List;

public class PeakElementInAnArray {

    public static void main(String[] args) {

        int[] ar = {1,2,3,4,5,2,3};
//        System.out.println(findSinglePeak(ar));
        System.out.println(findAllPeaks(ar));
    }

    public static int findSinglePeak(int[] arr){

        int len = arr.length;

        if (len==1) return arr[0];
//        if (arr[0]>=arr[1]) return arr[0];
//        if (arr[len-1]>=arr[len-2]) return arr[len-1];

        for (int i=1;i<len;i++){
            if (arr[i]>=arr[i-1] && arr[i]>=arr[i+1]){
                return arr[i];
            }
        }
        return -1;
    }

    public static List<Integer> findAllPeaks(int[] arr){
        List<Integer> allPeaks = new ArrayList<>();
        int len = arr.length;
        if (len==1) {
            allPeaks.add(arr[0]);
            return allPeaks;
        }

        // First Element
        if (arr[0]>=arr[1]){
            allPeaks.add(arr[0]);
        }

        // Middle elements
        for (int i=1;i<len-1;i++){
            if (arr[i]>=arr[i-1] && arr[i]>=arr[i+1]){
                allPeaks.add(arr[i]);
            }
        }

        // Last element

        if (arr[len-1]>=arr[len-2]){
            allPeaks.add(arr[len-1]);
        }
        return allPeaks;
    }

}
