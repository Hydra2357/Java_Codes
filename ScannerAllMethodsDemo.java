package JavaByCoderArmy;

import java.util.Scanner;
import java.util.Locale;
import java.util.regex.Pattern;

public class ScannerAllMethodsDemo {
    public static void main(String[] args) {

        // Create Scanner object for keyboard input
        Scanner sc = new Scanner(System.in);

        System.out.println("=== Java Scanner Class - All Major Methods Demo ===\n");

        // 1. Reading different primitive types
        System.out.print("Enter your full name (with spaces): ");
        String fullName = sc.nextLine();                    // Reads entire line

        System.out.print("Enter your age (int): ");
        int age = sc.nextInt();

        System.out.print("Enter your height in meters (double): ");
        double height = sc.nextDouble();

        System.out.print("Enter your salary (float): ");
        float salary = sc.nextFloat();

        System.out.print("Enter your mobile number (long): ");
        long mobile = sc.nextLong();

        System.out.print("Enter your grade (char - enter single letter): ");
        char grade = sc.next().charAt(0);                   // next() + charAt(0)

        System.out.print("Enter a byte value (e.g. 100): ");
        byte b = sc.nextByte();

        System.out.print("Enter a short value (e.g. 30000): ");
        short s = sc.nextShort();

        System.out.print("Are you a student? (true/false): ");
        boolean isStudent = sc.nextBoolean();

        // Consume the leftover newline after nextBoolean()
        sc.nextLine();

        // 2. next() vs nextLine()
        System.out.print("Enter a sentence with multiple words: ");
        String sentence = sc.nextLine();                    // Reads full line with spaces

        System.out.print("Enter one word only: ");
        String word = sc.next();                            // Reads only one word (stops at space)

        // 3. hasNext() family - checking before reading
        System.out.println("\n=== hasNext() Methods Demo ===");
        System.out.print("Enter something (number or text): ");

        if (sc.hasNextInt()) {
            System.out.println("You entered an Integer: " + sc.nextInt());
        } else if (sc.hasNextDouble()) {
            System.out.println("You entered a Double: " + sc.nextDouble());
        } else if (sc.hasNextBoolean()) {
            System.out.println("You entered a Boolean: " + sc.nextBoolean());
        } else {
            System.out.println("You entered text: " + sc.next());
        }

        // 4. Configuration methods
        System.out.println("\n=== Configuration Methods ===");

        sc.useDelimiter(",");                               // Change delimiter to comma
        System.out.println("Delimiter changed to comma.");

        System.out.println("Current delimiter: " + sc.delimiter());

        sc.useLocale(Locale.US);                            // Change locale
        System.out.println("Locale set to US: " + sc.locale());

        sc.useRadix(10);                                    // Set number radix (default 10)
        System.out.println("Radix set to 10");

        // 5. Pattern matching methods
        System.out.println("\n=== Pattern Matching Methods ===");
        System.out.print("Enter a line containing a number somewhere: ");
        sc.nextLine(); // consume previous line if needed
        String line = sc.nextLine();

        String found = sc.findInLine("\\d+");               // Find digits in current line
        if (found != null) {
            System.out.println("Number found in line using findInLine(): " + found);
        }

        // 6. Other useful methods
        System.out.println("\n=== Other Methods ===");
        System.out.println("Has more tokens? " + sc.hasNext());
        System.out.println("Has next line? " + sc.hasNextLine());

        // Reset scanner to default settings
        sc.reset();
        System.out.println("Scanner reset to default settings.");

        // 7. Close the scanner (good practice)
        sc.close();
        System.out.println("\nScanner closed. Program finished.");

        // Display all collected input
        System.out.println("\n=== Summary of Your Input ===");
        System.out.println("Name       : " + fullName);
        System.out.println("Age        : " + age);
        System.out.println("Height     : " + height + " m");
        System.out.println("Salary     : " + salary);
        System.out.println("Mobile     : " + mobile);
        System.out.println("Grade      : " + grade);
        System.out.println("Byte       : " + b);
        System.out.println("Short      : " + s);
        System.out.println("Student    : " + isStudent);
        System.out.println("Sentence   : " + sentence);
        System.out.println("Single word: " + word);
    }
}