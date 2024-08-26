import java.util.Scanner;

public class ReverseANumber {
    public static void main(String[] args) {

        int n, rev = 0, r;
        Scanner scanner = new Scanner(System.in);
        System.out.println("enter the number");
        n = scanner.nextInt();
        while (n > 0) {
            r = n % 10;
            rev = rev * 10 + r;
            n = n / 10;
        }
        System.out.println("reverse is :" + rev);
    }
}
