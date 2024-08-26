public class CountNumbersInaRangeInArray {

    public static void main(String[] args) {
        int r1=1,r2=5,count=0;
        int[] arr = {1,2,3,5,6,0,4};
        for (int j : arr) {
            if (j >= r1 && j <= r2) {
                count++;
            }
        }
        System.out.println(count);
    }
}
