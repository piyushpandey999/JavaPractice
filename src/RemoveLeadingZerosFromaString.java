import java.util.Scanner;

public class RemoveLeadingZerosFromaString {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("enter a string");
        String str = scanner.nextLine();
        // String str = "0000123405";
        System.out.println("string before removing zeros -" + str);
        System.out.println("string after removing zeros -" + method1(str));
    }

    public static String method1(String str) {

        int i = 0;
        while (i < str.length() && str.charAt(i) == '0')
            i++;
        StringBuilder sb = new StringBuilder(str);

        // below replace function removes i characters from given index ( 0 here)
        sb.replace(0, i, "");

        return sb.toString();
    }

}
