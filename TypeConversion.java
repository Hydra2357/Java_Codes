package JavaByCoderArmy;

public class TypeConversion {
    public static void main() {
        //Implicit Conversion
        byte b = 24;
        int i;
        i = b;
        System.out.println(i);

        char c= 'a';
        int j;
        j = c;
        System.out.println(j);

        //Explicit conversion
        int k =56;
        byte t;
        t= (byte)k;
        System.out.println(t);

        //Truncating Conversion
        float f1 = 15.645f;
        int g;
        g= (int) f1;
        System.out.println(g);

        //Boolean to any datatype
        boolean bool = false;
        int w;
        // Boolean cant convert ot any datatype
        byte u= 50;
        u =(byte)(u*2);
        System.out.println(u);

    }
}
