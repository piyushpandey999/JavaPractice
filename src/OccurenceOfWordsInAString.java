import java.util.HashMap;
import java.util.Scanner;

public class OccurenceOfWordsInAString {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("enter the string");
        String str = scanner.nextLine();
        // occurenceOfWord1(str);
        occurenceofWords2(str);
    }

    public static void occurenceOfWord1(String str) {

        // -------- declaring a hashmap of string and integer ----------
        HashMap<String, Integer> hashMap = new HashMap<String, Integer>();

        // ------------ splitting the words of string and storing them in array -------
        String[] words = str.split(" ");

        for (String word : words) {

            // ------ checking whether the hashmap contains the key or not ------------
            if (hashMap.containsKey(word)) {
                hashMap.put(word, hashMap.get(word) + 1);
            } else {
                hashMap.put(word, 1);
            }
        }
        // ----------- print the hashmap ----------
        System.out.println(hashMap);
    }

    public static void occurenceofWords2(String str) {

        // -------- declaring a hashmap of string and integer ----------
        HashMap<String, Integer> hashMap = new HashMap<String, Integer>();

        // ------------ splitting the words of string and storing them in array -------
        String[] words = str.split(" ");

        for (String word : words) {
            Integer integer = hashMap.get(word);

            if (integer == null) {
                hashMap.put(word, 1);
            } else {
                hashMap.put(word, integer + 1);
            }
        }
        System.out.println(hashMap);
    }
}
