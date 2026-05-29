package JavaByCoderArmy;

public class StringBuilderDemo {

    public static void main(String[] args) {

        System.out.println("=== StringBuilder Comprehensive Demo ===\n");

        // 1. Creating StringBuilder
        StringBuilder sb1 = new StringBuilder();                    // default capacity 16
        StringBuilder sb2 = new StringBuilder("Hello");             // with initial string
        StringBuilder sb3 = new StringBuilder(100);           // with initial capacity

        System.out.println("Initial Capacity of sb3: " + sb3.capacity());

        // 2. Basic Operations - append()
        StringBuilder sb = new StringBuilder();
        sb.append("Hello")
                .append(" ")
                .append("World")
                .append(2026)
                .append(" ")
                .append(true)
                .append(" ")
                .append(3.14);

        System.out.println("After append: " + sb);

        // 3. insert()
        sb.insert(6, "Beautiful ");
        System.out.println("After insert: " + sb);

        // 4. delete() and deleteCharAt()
        sb.delete(5, 15);                    // delete " Beautiful"
        System.out.println("After delete: " + sb);

        sb.deleteCharAt(0);                  // remove first character
        System.out.println("After deleteCharAt: " + sb);

        // 5. replace()
        sb.replace(0, 5, "Welcome");
        System.out.println("After replace: " + sb);

        // 6. reverse()
        StringBuilder rev = new StringBuilder("Java Programming");
        rev.reverse();
        System.out.println("Reversed: " + rev);

        // 7. Other useful methods
        System.out.println("Length: " + sb.length());
        System.out.println("Capacity: " + sb.capacity());
        System.out.println("Char at index 1: " + sb.charAt(1));

        sb.setCharAt(1, 'a');
        System.out.println("After setCharAt: " + sb);

        // 8. indexOf and lastIndexOf
        StringBuilder text = new StringBuilder("Hello Java Hello World");
        System.out.println("First 'Hello': " + text.indexOf("Hello"));
        System.out.println("Last 'Hello': " + text.lastIndexOf("Hello"));

        // 9. substring()
        String sub = text.substring(6, 10);
        System.out.println("Substring(6,10): " + sub);

        // 10. Real World Example 1: JSON Builder
        System.out.println("\n--- JSON Builder Example ---");
        String json = buildUserJson("Mahesh", 28, new String[]{"Java", "Spring", "AWS"});
        System.out.println(json);

        // 11. Real World Example 2: CSV Builder
        System.out.println("\n--- CSV Builder Example ---");
        String[][] data = {
                {"Name", "Age", "City"},
                {"Mahesh", "28", "Mumbai"},
                {"Priya", "25", "Delhi"}
        };
        System.out.println(toCsv(data));

        // 12. Real World Example 3: String Compression
        System.out.println("\n--- String Compression Example ---");
        System.out.println("aaabbcccaaa -> " + compress("aaabbcccaaa"));

        // 13. Capacity Management
        System.out.println("\n--- Capacity Management ---");
        StringBuilder efficient = new StringBuilder(50);
        System.out.println("Initial Capacity: " + efficient.capacity());

        efficient.append("This is a very long string for demonstration purpose.");
        System.out.println("After append - Length: " + efficient.length() +
                ", Capacity: " + efficient.capacity());

        efficient.ensureCapacity(200);
        System.out.println("After ensureCapacity(200): " + efficient.capacity());

        efficient.trimToSize();
        System.out.println("After trimToSize(): " + efficient.capacity());
    }

    // ==================== REAL WORLD UTILITY METHODS ====================

    // JSON Builder
    public static String buildUserJson(String name, int age, String[] skills) {
        StringBuilder json = new StringBuilder();
        json.append("{\n");
        json.append("  \"name\": \"").append(name).append("\",\n");
        json.append("  \"age\": ").append(age).append(",\n");
        json.append("  \"skills\": [");

        for (int i = 0; i < skills.length; i++) {
            json.append("\"").append(skills[i]).append("\"");
            if (i < skills.length - 1) {
                json.append(", ");
            }
        }
        json.append("]\n}");
        return json.toString();
    }

    // CSV Builder
    public static String toCsv(String[][] data) {
        StringBuilder csv = new StringBuilder();

        for (String[] row : data) {
            for (int i = 0; i < row.length; i++) {
                csv.append(row[i]);
                if (i < row.length - 1) {
                    csv.append(",");
                }
            }
            csv.append("\n");
        }
        return csv.toString();
    }

    // Run Length Encoding (Compression)
    public static String compress(String str) {
        StringBuilder result = new StringBuilder();
        int count = 1;

        for (int i = 0; i < str.length(); i++) {
            if (i + 1 < str.length() && str.charAt(i) == str.charAt(i + 1)) {
                count++;
            } else {
                result.append(str.charAt(i));
                if (count > 1) {
                    result.append(count);
                }
                count = 1;
            }
        }
        return result.toString();
    }
}