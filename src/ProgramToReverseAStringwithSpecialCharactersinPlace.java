public class ProgramToReverseAStringwithSpecialCharactersinPlace {

    public static void main(String[] args) {

        String str = "he@lo&tr";
        String rev = reverseWithSpecialCharacters(str);
        System.out.println("Reverse string is - "+ rev);
    }



    public static String reverseWithSpecialCharacters(String str){

        char[] car = str.toCharArray();
        int left=0;
        int right = car.length-1;

        while (left<right){

            if (!Character.isLetterOrDigit(car[left])){
                left++;
            }
            else if (!Character.isLetterOrDigit(car[right])){
                right--;
            }
            else {
                char temp = car[left];
                car[left]= car[right];
                car[right]=temp;
                left++;
                right--;
            }
        }
        return new String(car);
    }
}
