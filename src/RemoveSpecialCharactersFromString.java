public class RemoveSpecialCharactersFromString {

   public static void main(String[] args) {
        String s = "rt@JH$H*KH)KH_GK#MB!";
        removeCharacters(s);
    }

    private static void removeCharacters(String s){

        StringBuilder sb = new StringBuilder(s);

        for (int i=0;i<sb.length();i++){
                if (!Character.isLetter(sb.charAt(i))){
                    sb.deleteCharAt(i);
                    i--;
                }
        }
        System.out.println(sb);
    }
}
