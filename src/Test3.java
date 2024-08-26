public class Test3 {
    public static void main(String[] args) {
        int[] array = {1,2,3,4,5,6,7,8,9,10,11,12};
        System.out.println(secondLargest(array));
    }
public static int secondLargest(int[] input){
        int firstLargest, secondLargest;
        if(input[0]>input[1]){
            firstLargest=input[0];
            secondLargest=input[1];
        }
        else {
            secondLargest=input[0];
            firstLargest=input[1];
        }
        for (int i=2;i< input.length;i++) {
            if (input[i]>firstLargest){
                secondLargest=firstLargest;
                firstLargest=input[i];
            } else if (input[i]<firstLargest && input[i]>secondLargest) {
                secondLargest=input[i];
            }
        }
     return secondLargest;
}

}
