import java.util.Scanner;

public class Palindrome {
    public static void main(String[] args) {

        int n, p, rev = 0, r;
        Scanner scanner = new Scanner(System.in);
        System.out.println("enter any number");
        n = scanner.nextInt();
        p = n;
        while (n > 0) {
            r = n % 10;
            rev = rev * 10 + r;
            n = n / 10;

        }
        System.out.println("reverse is" + " " + rev);

        if (rev == p) {
            System.out.println("palindrome");
        } else {
            System.out.println("not palindrome");
        }
    }
}
