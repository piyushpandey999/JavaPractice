public class PairstoTargetSum {

    // java program to find all pairs that sum to a target value in an array.

    public static void findPairtoTargetSum(int[] arr, int target){
        boolean found = false;

        for (int i=0;i<arr.length;i++){
            for (int j=i+1;j<arr.length;j++){
                if (arr[i]+arr[j] == target){
                    System.out.println("Pair found - "+ arr[i]+" & "+arr[j]);
                    found = true;
                }
            }
        }
        if (!found){
            System.out.println("No pairs found that sum to " + target);
        }
    }


    public static void main(String[] args) {
        int[] arr = {1,3,9,2,0,8,4,6};
        int target = 9;
        findPairtoTargetSum(arr,target);
    }
}
