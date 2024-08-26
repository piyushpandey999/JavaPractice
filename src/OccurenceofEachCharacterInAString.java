import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class OccurenceofEachCharacterInAString {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("enter the string");
        String str = scanner.nextLine();
        characterCount(str);
    }

    public static void characterCount(String str) {

        // ----------- Creating a HashMap containing char as a key and occurrences as a
        // value -----------
        HashMap<Character, Integer> charCount = new HashMap<Character, Integer>();

        // ----------- converting given string to character array --------------
        char[] strArray = str.toCharArray();

        // -------- checking each char of string array ------------
        for (char c : strArray) {
            if (charCount.containsKey(c)) {

                // ------- if character is present in charCount increment its count by 1
                // ---------
                charCount.put(c, charCount.get(c) + 1);
            }
            // -------- if character is not present in the charCount then put its value as 1
            // --------
            else {
                charCount.put(c, 1);
            }
        }
        // System.out.println(str + " -> " + charCount);
        // ---------- printing the charCount ---------------
        // for(Map.Entry entry:charCount.entrySet()){
        // System.out.println((entry.getKey() + " " + entry.getValue()));
        // }
        for (Map.Entry<Character, Integer> entry : charCount.entrySet()) {
            if (entry.getValue() > 1) {
                System.out.println(entry.getKey() + " " + entry.getValue());
            }
        }
    }
}
