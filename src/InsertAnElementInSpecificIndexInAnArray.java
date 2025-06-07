import java.util.Scanner;

public class InsertAnElementInSpecificIndexInAnArray {

    public static void main(String[] args) {
        int[] arr = {3,2,1,5,6,8};
        int [] arr2 = {9,5,7,10,3,2};

        addElement1(arr);

        System.out.println("------------------------------------");
        addElements(arr2,3,40);
    }


    // Method to add element specific index for the same size of the array
    public static void addElement1(int[] arr){

        int pos = 5; int num = 10;
        for (int i=arr.length-1;i>pos;i--){
            arr[i]=arr[i-1];
        }
        arr[pos] = num;

        for (int k :arr) System.out.println(k);

    }



    // Method to add element at specific index in an array while increasing the size of the array and restoring all the elements in the old array
    public static void addElements(int[] arr,int ind, int element){
        int[] sar = new int[arr.length + 1];

        // Copy elements before the index
        for (int i = 0; i < ind; i++) {
            sar[i] = arr[i];
        }

        // Insert new element
        sar[ind] = element;

        // Copy the rest
        for (int j = ind; j < arr.length; j++) {
            sar[j + 1] = arr[j];
        }

        // Print the updated array
        for (int k : sar) {
            System.out.println(k);
        }
    }
}
