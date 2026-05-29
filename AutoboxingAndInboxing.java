package JavaByCoderArmy;

public class AutoboxingAndInboxing {
    public static void main(String[] args) {
//        AutoBoxing
        int x = 10;
        Integer y = x;

//        Unboxing
        System.out.println(x);
        System.out.println(y);

        Integer a = Integer.valueOf(20);
        int b = a;

        Integer x1 = 50;
        printInteger(x1);

        Integer x2 = null;
        int y1 = x;

        int e1 = 200;
        int e2 = 200;
        System.out.println(e1==e2);

        Integer s1 = 200;
        Integer s2 = 200;

        System.out.println(s1 == s2);
        System.out.println(s1.intValue() == s2.intValue());
        System.out.println(s1.equals(s2));

    }

    static void printInteger(int x) {
        System.out.println(x);
    }
}
