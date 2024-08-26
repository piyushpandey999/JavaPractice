import java.util.HashMap;

public class FirstNonRepeatingCharacter {
    public static void main(String[] args) {
        String str = "geeksforgeeks";
        reapeat(str);
    }

    public static void reapeat(String str) {
        HashMap<Character, Integer> map = new HashMap<Character, Integer>();
        char[] charArray = str.toCharArray();
        for (char c : charArray) {
            map.put(c, map.getOrDefault(c, 0) + 1);
        }

        for (char c : charArray) {
            if (map.get(c) == 1) {
                System.out.println("first non repeated character - " + c);
                return;
            }
        }
    }
}
