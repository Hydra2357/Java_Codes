package JavaByCoderArmy;

import java.sql.SQLOutput;

public class StringBuilderEg {
    public static void main(String[] args) {
        String s1 = new String();
        System.out.println(s1);

        String s2 = new String("Hydra");
        System.out.println(s2);

        String s3 = "Hydra";
        String s4 = new String(s3);
        System.out.println(s4);

        char[] arr1 = {'A', 'S', ' ', 'E', 'R', 'y'};
        String s5 = new String(arr1);
        arr1[0] = 'B';
        System.out.println(s5);
        // it printed same array not modified array
//        because string are immutable
        String s6 = new String(arr1, 0, 4);
        System.out.println(s6);

        byte[] arr2 = {97, 98, 99};
        String s7 = new String(arr2);
        System.out.println(s7);
        String s8 = new String(arr2, 0, 2);
        System.out.println(s8);

//        String Builder
        StringBuilder s9 = new StringBuilder("Hello");
        String s10 = new String(s9);
        System.out.println(s10);

        String s = "";
        int n  =10;
        for(int i = 0; i<n; i++) {
            s += i;
            System.out.println(s);
        }

        StringBuilder sb = new StringBuilder();
        for(int i = 0; i<n; i++) {
            sb.append("a");
        }
        String result = sb.toString();
        System.out.println(result);
        System.out.println();

//        Length or Emptiness
        String s11 = new String("Aditya");
        String s31 = new String("Aditya");
        String s21 = new String(" ");
        System.out.println(s11.isEmpty());
        System.out.println(s11.isBlank());
        System.out.println(s11.length());

        System.out.println();
        System.out.println(s21.isEmpty());
        System.out.println(s21.length());
        System.out.println(s21.isBlank());
        System.out.println();

        System.out.println(s11.charAt(2));
        char[] arr = s11.toCharArray();
        System.out.println(arr);

        System.out.println(s11 == s31);
        System.out.println(s11.equals(s31));
        System.out.println(s11.equalsIgnoreCase(s31));
        System.out.println();
//        lexicographical comparison

        String s41 = new String("abc");
        String s51 = new String("abd");
        System.out.println(s41 == s51);
        System.out.println(s41.compareTo(s51));
        System.out.println();

        System.out.println(s41.contains("bc"));
        System.out.println(s41.indexOf("bc"));
        System.out.println(s41.lastIndexOf("c"));

        System.out.println(s41.startsWith("a"));
        System.out.println(s41.startsWith("b"));
        System.out.println(s41.endsWith("c"));
//        Substring

        System.out.println(s41.substring(1, 3));
        System.out.println();

        String s45 = new String("HelloHydra404  ");
        System.out.println(s45);
        System.out.println(s45.toUpperCase());
        System.out.println(s45.toLowerCase());

        System.out.println(s45.trim());
        System.out.println(s45.split("ello"));
        System.out.println();
        System.out.println(s45.repeat(5));
        System.out.println(s45.replace("Hello", "the Great "));

        System.out.println(s45.replaceAll("Hello", "Hi!!!"));
        System.out.println();

        String s34 = "Hydra, Rahul, Cosmos";
        String[] arr3 = s34.split(", ");

        for (String str4: arr3) {
            System.out.println(str4);
        }

//        System.out.println(String.join("=", 'a', 'b', 'c'));

        String s55 = new String(String.valueOf(10));
        System.out.println(s55.length());

        byte[] arr6 = s2.getBytes();
        for(byte i: arr6) {
            System.out.print(i + ", ");
        }
        System.out.println();
//        Advance method
        String s66 = new String("hello");
        String s67 = s66.intern();
        System.out.println(s66 == s67);

//        format
        String nm = "Hydra404";
        int age = 45;

        System.out.println("Hello" + " " + nm + "," + "your age is " + age);
        System.out.println(String.format("Hello %s, your age is %s",nm, age ));
    }
}
