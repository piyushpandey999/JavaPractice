import java.util.LinkedHashSet;

public class RemoveDuplicatesFromString {

    public static void main(String[] args) {

        String str = "RemoveDuplicate";

        String loweString = str.toLowerCase();
        char[] chararray = loweString.toCharArray();

        LinkedHashSet<Character> uniqueSet = new LinkedHashSet<>();
        for (char c : chararray) {
            if (!uniqueSet.contains(c)) {
                uniqueSet.add(c);
            }
            StringBuilder sb = new StringBuilder();
            for (char c1 : uniqueSet) {
                sb.append(c1);
            }
            System.out.println(sb.toString());
        }
    }
}