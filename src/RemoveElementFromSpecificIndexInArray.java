public class RemoveElementFromSpecificIndexInArray {

    public static void main(String[] args) {
        int[] arr = {1,3,2,5,0,6};
        int index =4;
        removeElement(arr,index);
    }

   public static void removeElement(int[] arr , int index){
        int[] sar = new int[arr.length-1];
        for (int i=0,j=0;i<arr.length;i++){
            if (i==index)
                continue;
            sar[j++]=arr[i];
        }
        for(int j:sar){
            System.out.print(j);
        }
   }
}
