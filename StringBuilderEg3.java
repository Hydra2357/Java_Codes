package JavaByCoderArmy;

public class StringBuilderEg3 {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder();
        sb.append("Hydra404 ");
        sb.append("The Great.");

        System.out.println(sb.toString());

        sb.insert(2, "yd");
        System.out.println(sb.toString());

        sb.delete(0, 3);
        System.out.println(sb);
        sb.deleteCharAt(5);
        System.out.println(sb);

        sb.replace(4, 6, "aaa");
        System.out.println(sb);

        sb.reverse();
        System.out.println(sb);
        sb.reverse();
        System.out.println(sb);

        System.out.println();
        System.out.println(sb.charAt(2));

        sb.setCharAt(2, 'Z');
        System.out.println(sb);
        System.out.println();

        StringBuilder sb2 = new StringBuilder();
        sb2.append("Hydra404 ");
        sb2.append("The Great.");
        sb2.append(" aaaaa");

        System.out.println(sb2);
        System.out.println(sb2.capacity());
        sb2.ensureCapacity(100);
        System.out.println(sb2.capacity());
        sb2.trimToSize();
        System.out.println(sb2.capacity());

        sb2.delete(0, 3);
        System.out.println(sb2.capacity());
    }
}
