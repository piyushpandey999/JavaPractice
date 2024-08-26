
import java.util.Scanner;

public class fibonaccii {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("enter the number");
        int N = scanner.nextInt();
        fibonacci(N);
    }

    public static void fibonacci(int n) {
        int n1 = 0, n2 = 1, count = 0;
        while (count < n) {
            System.out.println(n1 + " ");

            int n3 = n2 + n1;
            n1 = n2;
            n2 = n3;
            count = count + 1;
        }
    }
}
