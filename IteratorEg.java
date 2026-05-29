package JavaByCoderArmy;

import java.util.*;

public class IteratorEg {
    public static void main(String[] args) {
//        List<Integer> l1 = new ArrayList<>();
//        List<Integer> l1 = new LinkedList<>();
        Collection<Integer> l1 = new LinkedList<>();
        l1.add(23);
        l1.add(546);
        l1.add(234);
        l1.add(89);

        Iterator<Integer> i1 = l1.iterator();
        while(i1.hasNext()) {
            System.out.println(i1.next());
        }
    }
}
