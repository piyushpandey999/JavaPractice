public class MoveZerosToEndinArray {
    public static void main(String[] args) {
        int[] array = {0,2,4,6,0,7,0,56};
        moveZerosToend(array);
        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
        }
    }

    public static void moveZerosToend(int[] arr){
        int count =0;
        for(int i=0; i<arr.length; i++){
            if (arr[i]!=0){
                int temp = arr[i];
                arr[i] = arr[count];
                arr[count] = temp;
                count++;
            }
        }
    }
}
