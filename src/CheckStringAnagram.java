import java.util.HashSet;

public class CheckStringAnagram {

    // ----- A Anagram string is a string that contains all the alphabets ------------

    public static void main(String[] args) {

        String s = "this is a test";
        if (checkAnagram(s)){
            System.out.println("STring - "+s+" -> is a Anagram");
        }
        else {
            System.out.println("String - "+s+" -> is not a Anagram");
        }
    }

    public static boolean checkAnagram(String s){

        HashSet<Character> set = new HashSet<>();
        char[] car = s.toCharArray();
        for (char c:car){
            if (c>='a' && c<='z'){
                set.add(c);
            }
        }
        return set.size()==26;
    }
}
