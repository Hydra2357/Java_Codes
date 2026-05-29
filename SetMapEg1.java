package JavaByCoderArmy;

import java.util.*;

public class SetMapEg1 {
    public static void main(String[] args) {
        Set<String> s1 = new HashSet<>();
        Set<String> s2 = new LinkedHashSet<>();

        s1.add("hydra");
        s1.add("rohit");
        s1.add("raju");
`
        System.out.println(s1.contains("hydra"));
        System.out.println(s1.contains("rohit"));
        System.out.println();

        Map<Integer, String> m1 = new HashMap<>();
        m1.put(101, "hydra");
        m1.put(102, "rohit");
        m1.put(103, "raju");
        System.out.println(m1.get(101));
        System.out.println(m1.get(102));
        System.out.println();

        System.out.println(m1.containsKey(103));
        System.out.println(m1.get(102));

    }
}
