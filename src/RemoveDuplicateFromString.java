import java.util.HashSet;
import java.util.LinkedHashSet;

public class RemoveDuplicateFromString {
    static StringBuilder sb;

    public static void main(String[] args) {
        String str = "RemoveDuplicates";
        String str1 = str.toLowerCase();
        char[] carray = str1.toCharArray();

        LinkedHashSet<Character> uniquSet = new LinkedHashSet<>();
        for (char c : carray) {
            if (!uniquSet.contains(c)) {
                uniquSet.add(c);
            }

            sb = new StringBuilder();
            for (char c1 : uniquSet) {
                sb.append(c1);
            }

        }
        System.out.println(sb.toString());
    }
}
