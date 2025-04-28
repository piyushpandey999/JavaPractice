import java.util.Scanner;

public class InsertAnElementInSpecificIndexInAnArray {

    public static void main(String[] args) {
        int[] arr = {3,2,1,5,6};
        int pos , num;
        Scanner scanner = new Scanner(System.in);
        System.out.println("enter the index");
        pos = scanner.nextInt();
        System.out.println("enter the number to add");
        num = scanner.nextInt();

        for (int i= arr.length-1;i>pos;i--){
            arr[i] = arr[i-1];
        }
        arr[pos] = num;

        for (int j : arr){
            System.out.println(j);
        }
    }
}
