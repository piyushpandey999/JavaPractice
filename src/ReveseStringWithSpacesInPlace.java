

public class ReveseStringWithSpacesInPlace {

    // ------ Java program to reverse a string with spaces in place ------------

    public static void main(String[] args) {
        String s = "this is not";
        reverseStringWithSpaceInPlace(s);
    }


    public static void reverseStringWithSpaceInPlace(String input){
        StringBuilder sb = new StringBuilder(input.replace(" ",""));
        sb.reverse();

        for (int i=0;i<input.length();i++){
            if (input.charAt(i)==' '){
                sb.insert(i," ");
            }
        }
        System.out.println(sb);
    }
}
