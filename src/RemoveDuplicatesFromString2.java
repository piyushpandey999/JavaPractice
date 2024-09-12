import java.util.HashSet;
import java.util.LinkedHashSet;

public class RemoveDuplicatesFromString2 {

    public static void main(String[] args) {

        String str = "Hello world";
        StringBuilder sb = new StringBuilder();

        LinkedHashSet<Character> set = new LinkedHashSet<Character>();
        for (int i = 0; i < str.length(); i++) {
            set.add(str.charAt(i));
        }
        for (Character c : set) {
            sb.append(c);
        }
        System.out.println(sb);
    }
}