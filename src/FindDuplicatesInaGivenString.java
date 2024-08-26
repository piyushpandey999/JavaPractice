import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class FindDuplicatesInaGivenString {

    public static void main(String[] args) {
        String str = "Helloworld";
        findDuplicatesInaGivenString(str);
    }

    public static void findDuplicatesInaGivenString(String str){
        HashMap<Character,Integer> map = new HashMap<Character,Integer>();
        char[] charArray = str.toCharArray();
        for(char c : charArray){
            if (map.containsKey(c)){
                map.put(c,map.get(c)+1);
            }
            else {
                map.put(c,1);
            }
        }
        // Store the key values in a set and then get the number of each duplicate character.
        Set<Character> set = map.keySet();
        for (char c :set){
            if (map.get(c)>1){
                System.out.println(c + " --> " + map.get(c));
            }
        }
    }
}
