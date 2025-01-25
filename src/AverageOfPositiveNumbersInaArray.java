public class AverageOfPositiveNumbersInaArray {

    public static void main(String[] args) {
        int[] arr = {1,-3,4,-6,-7,5,2,0,4};
        average(arr);
    }


    public static void average(int[] arr){
        int count =0;
        double average =0;
        int sum =0;
        for(int i=0;i<arr.length;i++){
            if (arr[i]>0){
                sum = sum+arr[i];
                count++;
            }
            average = (double) sum /count;
        }
        System.out.println(average);
    }
}
