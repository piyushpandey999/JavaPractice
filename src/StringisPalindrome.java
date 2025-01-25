import java.util.Scanner;

public class StringisPalindrome {
    public static void main(String[] args) {
        // Input string
        Scanner scanner = new Scanner(System.in);
        System.out.println("enter a string");
        String s = scanner.nextLine();
        if (isPalindrome(s)) {
            System.out.println("string is palindrome");
            //
        } else {
            System.out.println("string is not palindrome");
        }
    }

    public static boolean isPalindrome(String str) {
        String rev = "";
        boolean sts = false;

        for (int i = str.length()-1; i >= 0; i--) {
            rev = rev + str.charAt(i);
        }
        if (str.equals(rev)) {
            sts = true;
        }
        return sts;
    }
}
