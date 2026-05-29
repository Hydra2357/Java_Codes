package JavaByCoderArmy;

public class TypeConversion2 {

        public static void main(String[] args) {

            System.out.println("=== 1. Widening (Implicit/Automatic) Conversions ===\n");

            byte b = 100;
            short s = b;                // byte → short
            int i = s;                  // short → int
            long l = i;                 // int → long
            float f = l;                // long → float
            double d = f;               // float → double

            System.out.println("byte → short → int → long → float → double");
            System.out.println("byte b = " + b);
            System.out.println("double d = " + d + "  (automatic widening)\n");

            char ch = 'Z';              // Unicode 90
            int charToInt = ch;         // char → int (automatic)
            System.out.println("'Z' → int = " + charToInt + "  (ASCII/Unicode value)\n");


            System.out.println("=== 2. Narrowing (Explicit Casting) ===\n");

            double pi = 3.1415926535;
            float pf = (float) pi;      // double → float
            long bigNum = 9876543210L;
            int truncated = (int) bigNum;   // long → int (possible overflow)
            byte small = (byte) 200;        // int literal → byte (overflow wrap)

            System.out.println("double " + pi + " → int = " + (int)pi + "  (fraction lost)");
            System.out.println("double " + pi + " → byte = " + (byte)pi);
            System.out.println("long " + bigNum + " → int = " + truncated + "  (overflow!)");
            System.out.println("200 → byte = " + small + "  (wraps around)\n");


            System.out.println("=== 3. Type Promotion in Expressions ===\n");

            byte x = 30;
            byte y = 40;
            // byte sum = x + y;            // ERROR! promoted to int

            byte sumCasted = (byte)(x + y);
            int sumNormal = x + y;

            System.out.println("byte " + x + " + byte " + y + " → result type = int");
            System.out.println("int result  = " + sumNormal);
            System.out.println("byte result = " + sumCasted + "  (with cast)\n");


            short a = 15000;
            short bShort = 5000;
            // short resultShort = a + bShort;   // ERROR

            int mixed1 = a + bShort;             // promoted to int
            double mixed2 = a + 3.14;            // promoted to double
            float mixed3 = 10L + 5.5f;           // promoted to float

            System.out.println("short + short → int");
            System.out.println("short + double → double  → " + mixed2);
            System.out.println("long + float  → float   → " + mixed3 + "\n");


            System.out.println("=== 4. Mixed & Interesting Cases ===\n");

            char c1 = 'A';          // 65
            char c2 = 'B';          // 66
            int charSum = c1 + c2;  // promoted to int → 131

            byte b1 = 120;
            byte b2 = 50;
            byte overflow = (byte)(b1 + b2);   // 170 → -86 (wrap around)

            System.out.println("'A' + 'B' = " + charSum + "  (int result)");
            System.out.println("120 + 50 = " + (b1 + b2) + "  (int)");
            System.out.println("byte(120 + 50) = " + overflow + "  (overflow wrap)\n");


            System.out.println("=== 5. Common Pitfall Summary ===\n");
            System.out.println("• byte/short/char + anything arithmetic → promoted to int");
            System.out.println("• Widening   = safe, automatic");
            System.out.println("• Narrowing  = needs (cast), may lose data");
            System.out.println("• double > float > long > int > char/short/byte (promotion priority)");
            System.out.println("• boolean cannot be cast/converted to anything\n");

            System.out.println("All major type conversion & promotion behaviors shown above.");
        }

}
