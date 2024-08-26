import java.util.HashMap;
import java.util.Scanner;

public class TEst2 {
    public static void main(String[] args) {

//        secondlarest(34);
//        String str = " piyush ";
//        System.out.println(str.replace(" ","i"));
//        String str = "lox",rev = "";
//        char[] charArray = str.toCharArray();
//        for (int i=charArray.length-1;i>=0;i--) {
//            rev =rev+charArray[i];
//            if(str.equals(rev)){
//                System.out.println("string is palindrome");
//            }
//            else{
//                System.out.println("not");
//            }
//        }
//        int[] arr = {1,2,3,4,4};
//        for(int i=0;i<arr.length;i++){
//            for(int j=i+1;j<arr.length;j++){
//                if(arr[i]==arr[j]) {
//                    System.out.println(arr[j]);
//                    break;
//
//
//                }}}
        String str = "piyu123ush434";
        int count = 0;
//        char[] arr = str.toCharArray();
        for (int i = 0; i < str.length(); i++) {
//            if (str.charAt(i) >= '0' && str.charAt(i) <= '9')
            if (Character.isDigit(str.charAt(i))) {
                count++;
            }
        }

        System.out.println("no of integers in string - " + count);
//    }
//        int count = 0, num = 12345;
//        while (num != 0) {
//            num = num / 10;
//            count++;
//        }
//        System.out.println(count);


//    public static void revev(){
//        String str = "olx";
//
//    }

    }
}