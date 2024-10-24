import java.util.*;

public class CountOccurenceOfElementsInaList {
    public static void main(String[] args) {

        ArrayList<Integer> list = new ArrayList<Integer>();
        list.add(1);
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(3);
        list.add(34);

        Set<Integer> set = new HashSet<Integer>(list);
        for (int i : set) {
            System.out.println(i + ":-" + Collections.frequency(list,i));
        }




//
//        HashMap<Integer,Integer> map = new HashMap<Integer,Integer>();
//
//        for (int i : list) {
//            if (map.containsKey(i)) {
//                map.put(i,map.get(i));
//            }
//            else {
//                map.put(i,1);
//            }
//        }
//
//        for (Map.Entry entry : map.entrySet()) {
//            System.out.println(entry.getKey() + ":" + entry.getValue());
//        }



    }
}
