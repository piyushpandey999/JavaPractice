import java.util.Scanner;

public class ReveseAStringInbulitFunction {
    public static void main(String[] args) {
//        String str = "rahul";
        Scanner scanner = new Scanner(System.in);
        System.out.println("enter a string");
        String str = scanner.nextLine();
        StringBuilder str2 = new StringBuilder();
        str2.append(str);
        str2.reverse();
        System.out.println(str2);






    }
}
