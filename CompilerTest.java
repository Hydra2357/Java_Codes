package JavaByCoderArmy;

import java.util.Arrays;
import java.util.Scanner;

public class CompilerTest {
    public static void main(String[] args) {

        System.out.println("===== JAVA COMPILER TEST START =====");

        // 1️⃣ Simple For Loop
        System.out.println("\n1. Simple For Loop:");
        for (int i = 1; i <= 5; i++) {
            System.out.println("Number: " + i);
        }

        // 2️⃣ Reverse Loop
        System.out.println("\n2. Reverse Loop:");
        for (int i = 5; i >= 1; i--) {
            System.out.print(i + " ");
        }

        // 3️⃣ Nested Loop (Pattern)
        System.out.println("\n\n3. Nested Loop Pattern:");
        for (int i = 1; i <= 3; i++) {
            for (int j = 1; j <= 3; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }

        // 4️⃣ Arithmetic Test
        System.out.println("\n4. Arithmetic Test:");
        int a = 10;
        int b = 5;
        System.out.println("Addition: " + (a + b));
        System.out.println("Subtraction: " + (a - b));
        System.out.println("Multiplication: " + (a * b));
        System.out.println("Division: " + (a / b));

        // 5️⃣ If-Else Test
        System.out.println("\n5. If-Else Test:");
        if (a > b) {
            System.out.println("a is greater than b");
        } else {
            System.out.println("b is greater than a");
        }

        // 6️⃣ Scanner Input Test
        System.out.println("\n6. Scanner Input Test:");
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your name: ");
        String name = sc.nextLine();
        System.out.println("Hello, " + name);

        System.out.println("\n===== JAVA COMPILER TEST END =====");
        System.out.printf("Name: %s\n", name);
        System.out.println("CompilerTest.main");
        System.out.println("args = " + Arrays.toString(args));
        System.out.println("name = " + name);
        System.out.println("name = " + name);
    }
}
