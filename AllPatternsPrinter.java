package JavaByCoderArmy;

import java.util.Scanner;

public class AllPatternsPrinter {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int choice, rows;

        System.out.println("=============================================================");
        System.out.println("          BIG PATTERN PRINTER - ALL IN ONE JAVA CODE          ");
        System.out.println("=============================================================");
        System.out.println("This single program contains 17+ most popular patterns:");
        System.out.println("★ Star Patterns + Alphabet Patterns (Letters)");
        System.out.println("These are the EXACT patterns asked in interviews:");
        System.out.println("   TCS, Infosys, Accenture, Amazon, Wipro, Capgemini, etc.");
        System.out.println("=============================================================");

        do {
            System.out.println("\n--------------------- MENU ---------------------");
            System.out.println("1.  Right Angled Star Triangle");
            System.out.println("2.  Inverted Right Angled Star Triangle");
            System.out.println("3.  Pyramid Star Pattern          (most asked)");
            System.out.println("4.  Inverted Pyramid Star Pattern");
            System.out.println("5.  Diamond Star Pattern          (very common)");
            System.out.println("6.  Hollow Diamond Star Pattern");
            System.out.println("7.  Butterfly Star Pattern        (favorite in interviews)");
            System.out.println("8.  Hollow Pyramid Star Pattern");
            System.out.println("9.  Square Star Pattern");
            System.out.println("10. Hollow Square Star Pattern");
            System.out.println("11. X (Cross) Star Pattern");
            System.out.println("12. Simple Alphabet Triangle (A, AB, ABC...)");
            System.out.println("13. Centered Alphabet Pyramid");
            System.out.println("14. Palindromic Alphabet Pyramid (ABCBA)");
            System.out.println("15. Letter Rows Pattern (A / BB / CCC)");
            System.out.println("16. Floyd's Alphabet Triangle");
            System.out.println("17. Hourglass Star Pattern        (bonus interview pattern)");
            System.out.println("0.  EXIT");
            System.out.println("------------------------------------------------");
            System.out.print("Enter your choice: ");
            choice = sc.nextInt();

            if (choice >= 1 && choice <= 17) {
                System.out.print("Enter number of rows (recommended 5-10): ");
                rows = sc.nextInt();
                System.out.println("\nPattern Output:\n");
            } else {
                rows = 0;
            }

            switch (choice) {
                case 1:  printRightTriangle(rows); break;
                case 2:  printInvertedRightTriangle(rows); break;
                case 3:  printPyramid(rows); break;
                case 4:  printInvertedPyramid(rows); break;
                case 5:  printDiamond(rows); break;
                case 6:  printHollowDiamond(rows); break;
                case 7:  printButterfly(rows); break;
                case 8:  printHollowPyramid(rows); break;
                case 9:  printSquare(rows); break;
                case 10: printHollowSquare(rows); break;
                case 11: printXPattern(rows); break;
                case 12: printAlphabetTriangle(rows); break;
                case 13: printCenteredAlphabetPyramid(rows); break;
                case 14: printPalindromicAlphabet(rows); break;
                case 15: printLetterRows(rows); break;
                case 16: printFloydAlphabet(rows); break;
                case 17: printHourglass(rows); break;
                case 0:  System.out.println("Thank you! Happy Coding! 🚀"); break;
                default: System.out.println("Invalid choice! Try again.");
            }
        } while (choice != 0);

        sc.close();
    }

    // ======================== STAR PATTERNS ========================

    private static void printRightTriangle(int n) {
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    private static void printInvertedRightTriangle(int n) {
        for (int i = n; i >= 1; i--) {
            for (int j = 1; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    private static void printPyramid(int n) {
        for (int i = 1; i <= n; i++) {
            for (int s = 1; s <= n - i; s++) System.out.print("  ");
            for (int j = 1; j <= i; j++) System.out.print("* ");
            System.out.println();
        }
    }

    private static void printInvertedPyramid(int n) {
        for (int i = n; i >= 1; i--) {
            for (int s = 1; s <= n - i; s++) System.out.print("  ");
            for (int j = 1; j <= i; j++) System.out.print("* ");
            System.out.println();
        }
    }

    private static void printDiamond(int n) {
        // Upper half
        for (int i = 1; i <= n; i++) {
            for (int s = 1; s <= n - i; s++) System.out.print("  ");
            for (int j = 1; j <= 2 * i - 1; j++) System.out.print("* ");
            System.out.println();
        }
        // Lower half
        for (int i = n - 1; i >= 1; i--) {
            for (int s = 1; s <= n - i; s++) System.out.print("  ");
            for (int j = 1; j <= 2 * i - 1; j++) System.out.print("* ");
            System.out.println();
        }
    }

    private static void printHollowDiamond(int n) {
        int total = 2 * n - 1;
        for (int i = 1; i <= total; i++) {
            int stars = (i <= n) ? i : total - i + 1;
            for (int s = 1; s <= n - stars; s++) System.out.print("  ");
            for (int j = 1; j <= 2 * stars - 1; j++) {
                if (j == 1 || j == 2 * stars - 1 || i == n)
                    System.out.print("* ");
                else
                    System.out.print("  ");
            }
            System.out.println();
        }
    }

    private static void printButterfly(int n) {
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) System.out.print("* ");
            for (int s = 1; s <= 2 * (n - i); s++) System.out.print("  ");
            for (int j = 1; j <= i; j++) System.out.print("* ");
            System.out.println();
        }
        for (int i = n; i >= 1; i--) {
            for (int j = 1; j <= i; j++) System.out.print("* ");
            for (int s = 1; s <= 2 * (n - i); s++) System.out.print("  ");
            for (int j = 1; j <= i; j++) System.out.print("* ");
            System.out.println();
        }
    }

    private static void printHollowPyramid(int n) {
        for (int i = 1; i <= n; i++) {
            for (int s = 1; s <= n - i; s++) System.out.print("  ");
            for (int j = 1; j <= 2 * i - 1; j++) {
                if (j == 1 || j == 2 * i - 1 || i == n)
                    System.out.print("* ");
                else
                    System.out.print("  ");
            }
            System.out.println();
        }
    }

    private static void printSquare(int n) {
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    private static void printHollowSquare(int n) {
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n; j++) {
                if (i == 1 || i == n || j == 1 || j == n)
                    System.out.print("* ");
                else
                    System.out.print("  ");
            }
            System.out.println();
        }
    }

    private static void printXPattern(int n) {
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n; j++) {
                if (i == j || i + j == n + 1)
                    System.out.print("* ");
                else
                    System.out.print("  ");
            }
            System.out.println();
        }
    }

    private static void printHourglass(int n) {
        // Upper half
        for (int i = n; i >= 1; i--) {
            for (int s = 1; s <= n - i; s++) System.out.print("  ");
            for (int j = 1; j <= 2 * i - 1; j++) System.out.print("* ");
            System.out.println();
        }
        // Lower half
        for (int i = 2; i <= n; i++) {
            for (int s = 1; s <= n - i; s++) System.out.print("  ");
            for (int j = 1; j <= 2 * i - 1; j++) System.out.print("* ");
            System.out.println();
        }
    }

    // ======================== LETTER / ALPHABET PATTERNS ========================

    private static void printAlphabetTriangle(int n) {
        char ch = 'A';
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(ch++ + " ");
            }
            ch = 'A'; // reset for next row? No, continue for continuous
            // Wait, for continuous A B C D across rows:
            // Actually standard is start from A each time? No, let's do continuous
            System.out.println();
        }
    }

    private static void printCenteredAlphabetPyramid(int n) {
        char ch;
        for (int i = 1; i <= n; i++) {
            for (int s = 1; s <= n - i; s++) System.out.print("  ");
            ch = 'A';
            for (int j = 1; j <= i; j++) {
                System.out.print(ch++ + " ");
            }
            System.out.println();
        }
    }

    private static void printPalindromicAlphabet(int n) {
        for (int i = 1; i <= n; i++) {
            for (int s = 1; s <= n - i; s++) System.out.print("  ");
            // Left side
            for (char ch = 'A'; ch < 'A' + i; ch++) {
                System.out.print(ch + " ");
            }
            // Right side (excluding middle)
            for (char ch = (char) ('A' + i - 2); ch >= 'A'; ch--) {
                System.out.print(ch + " ");
            }
            System.out.println();
        }
    }

    private static void printLetterRows(int n) {
        char ch = 'A';
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(ch + " ");
            }
            ch++;
            System.out.println();
        }
    }

    private static void printFloydAlphabet(int n) {
        char ch = 'A';
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(ch++ + " ");
            }
            System.out.println();
        }
    }

    // ======================== INTERVIEW BONUS PATTERNS ========================
    // All above are asked in interviews. The ones marked (most asked), (very common), (favorite)
    // are the highest frequency ones in real interviews.
}