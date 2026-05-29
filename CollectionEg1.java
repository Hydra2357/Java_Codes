package JavaByCoderArmy;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class CollectionEg1 {
    public static void main(String[] args) {
        Collection<Integer> c1 = new ArrayList<>();
        c1.add(12);
        c1.add(23);
        c1.add(45);

        int n = c1.size();
        System.out.println(c1.size());
        System.out.println(c1);
        System.out.println(c1.isEmpty());

        System.out.println(c1.contains(23));
//        object to array
        System.out.println();
        Object[] obj = c1.toArray();
         for(Object o: obj) {
             System.out.println(o);
         }

         Integer[] arr = new Integer[0];
         Integer[] arr2 = c1.toArray(arr);
         for(Integer i: arr) {
             System.out.println(i);

         }
        System.out.println();
        System.out.println(c1.containsAll(List.of(1, 2, 3)));

    }
}
