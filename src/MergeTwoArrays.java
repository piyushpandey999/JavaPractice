import java.util.Arrays;

public class MergeTwoArrays {
    public static void main(String[] args) {

        int[] a1 = {8,4,6,3,2};
        int[] b1 = {7,3,2,};
        int[] c1 = new int[a1.length+b1.length];

        for (int i=0;i<a1.length;i++){
            c1[i] = a1[i];
        }
        for (int j=0;j<b1.length;j++){
            c1[a1.length+j] = b1[j];
        }
        System.out.println(c1.length);
        System.out.println(Arrays.toString(c1));
    }
}
