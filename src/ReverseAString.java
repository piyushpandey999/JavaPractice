import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class ReverseAString {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("enter the string");
        String str = scanner.nextLine();
        // String str = "ram";
        char[] chararray = str.toCharArray();
        //
        for (int i = chararray.length - 1; i >= 0; i--) {
            System.out.print(chararray[i]);
        }
    }
}
