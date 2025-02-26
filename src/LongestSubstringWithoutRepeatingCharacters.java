import java.util.HashSet;

public class LongestSubstringWithoutRepeatingCharacters {
    public static void main(String[] args) {
        String str = "Piyiushs";
        int result = LongestUniqueSubstring(str);
        System.out.println("longest unique substring is - " + result);
    }

    public static int LongestUniqueSubstring(String str){
        int right = 0, left = 0;
        int maxLength = 0;

        HashSet<Character> set = new HashSet<Character>();
        while (right<str.length()){
            if (!set.contains(str.charAt(right))) {
                    set.add(str.charAt(right));
                    maxLength = Math.max(maxLength,right-left+1);
                    right++;
            }
            else {
                set.remove(str.charAt(left));
                left++;
            }
        }
        return maxLength;
    }
}
