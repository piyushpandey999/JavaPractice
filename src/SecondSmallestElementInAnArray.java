public class SecondSmallestElementInAnArray {

    public static void main(String[] args) {
        int[] arr = {4,5,9,10,45,2};
        int smallest = Integer.MAX_VALUE , secondSmallest = Integer.MAX_VALUE;

        for (int i=0;i<arr.length;i++){
            if (arr[i]<smallest){
                smallest = arr[i];
            }
        }
        System.out.println("smallest number is "+ smallest);

        for (int i=0;i<arr.length;i++){
            if (arr[i]<secondSmallest && arr[i]>smallest){
                secondSmallest = arr[i];
            }
        }
        System.out.println("second smallest is "+ secondSmallest);
    }
}
