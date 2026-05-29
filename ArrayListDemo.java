package JavaByCoderArmy;

import java.util.*;
import java.util.List;
import java.util.Arrays;
import java.util.function.Predicate;
import java.util.function.UnaryOperator;

public class ArrayListDemo {
    public static void main(String[] args) {

        // ========== 1. CREATING ARRAYLIST ==========
        System.out.println("========== CREATING ARRAYLIST ==========");

        // Method 1: Default constructor
        ArrayList<String> list1 = new ArrayList<>();

        // Method 2: With initial capacity
        ArrayList<String> list2 = new ArrayList<>(20);

        // Method 3: From another collection
        List<String> initialList = Arrays.asList("Apple", "Banana", "Cherry");
        ArrayList<String> list3 = new ArrayList<>(initialList);

        // Method 4: Using List.of() (immutable first, then convert)
        ArrayList<String> list4 = new ArrayList<>(List.of("Dog", "Cat", "Bird"));

        System.out.println("List 3: " + list3);
        System.out.println("List 4: " + list4);

        // ========== 2. ADDING ELEMENTS ==========
        System.out.println("\n========== ADDING ELEMENTS ==========");
        ArrayList<String> fruits = new ArrayList<>();

        // add(E element) - adds at the end
        fruits.add("Apple");
        fruits.add("Banana");
        fruits.add("Cherry");
        System.out.println("After add: " + fruits);

        // add(int index, E element) - adds at specific position
        fruits.add(1, "Blueberry");
        System.out.println("After adding at index 1: " + fruits);

        // addAll(Collection c) - adds all elements from collection
        ArrayList<String> moreFruits = new ArrayList<>(List.of("Date", "Elderberry"));
        fruits.addAll(moreFruits);
        System.out.println("After addAll: " + fruits);

        // addAll(int index, Collection c) - adds collection at specific index
        fruits.addAll(2, List.of("Cranberry", "Dragonfruit"));
        System.out.println("After addAll at index 2: " + fruits);

        // ========== 3. ACCESSING ELEMENTS ==========
        System.out.println("\n========== ACCESSING ELEMENTS ==========");

        // get(int index)
        System.out.println("Element at index 2: " + fruits.get(2));

        // indexOf(Object o)
        System.out.println("Index of 'Banana': " + fruits.indexOf("Banana"));
        System.out.println("Last index of 'Banana': " + fruits.lastIndexOf("Banana"));

        // contains(Object o)
        System.out.println("Contains 'Apple'? " + fruits.contains("Apple"));
        System.out.println("Contains 'Mango'? " + fruits.contains("Mango"));

        // isEmpty()
        System.out.println("Is list empty? " + fruits.isEmpty());

        // size()
        System.out.println("Size of list: " + fruits.size());

        // ========== 4. UPDATING ELEMENTS ==========
        System.out.println("\n========== UPDATING ELEMENTS ==========");

        // set(int index, E element) - replaces and returns old value
        String oldValue = fruits.set(1, "Blackberry");
        System.out.println("Old value at index 1: " + oldValue);
        System.out.println("After set: " + fruits);

        // replaceAll(UnaryOperator) - Java 8+
        fruits.replaceAll(String::toUpperCase);
        System.out.println("After replaceAll to uppercase: " + fruits);

        // ========== 5. REMOVING ELEMENTS ==========
        System.out.println("\n========== REMOVING ELEMENTS ==========");

        // remove(int index) - removes by index
        String removed = fruits.remove(1);
        System.out.println("Removed element: " + removed);
        System.out.println("After remove by index: " + fruits);

        // remove(Object o) - removes by object
        boolean removedFlag = fruits.remove("BANANA");
        System.out.println("Was 'BANANA' removed? " + removedFlag);
        System.out.println("After remove by object: " + fruits);

        // removeAll(Collection c)
        ArrayList<String> toRemove = new ArrayList<>(List.of("CHERRY", "DATE"));
        fruits.removeAll(toRemove);
        System.out.println("After removeAll: " + fruits);

        // removeIf(Predicate) - Java 8+
        fruits.addAll(List.of("FIG", "GRAPE", "APPLE"));
        fruits.removeIf(fruit -> fruit.startsWith("G"));
        System.out.println("After removeIf (starts with G): " + fruits);

        // retainAll(Collection c) - keeps only elements in collection
        fruits.addAll(List.of("MANGO", "ORANGE"));
        ArrayList<String> toKeep = new ArrayList<>(List.of("APPLE", "MANGO", "FIG"));
        fruits.retainAll(toKeep);
        System.out.println("After retainAll: " + fruits);

        // clear() - removes all elements
        ArrayList<String> tempList = new ArrayList<>(List.of("A", "B", "C"));
        System.out.println("Before clear: " + tempList);
        tempList.clear();
        System.out.println("After clear: " + tempList);

        // ========== 6. ITERATING OVER ARRAYLIST ==========
        System.out.println("\n========== ITERATING METHODS ==========");
        ArrayList<String> colors = new ArrayList<>(List.of("Red", "Green", "Blue", "Yellow"));

        // Method 1: Traditional for loop
        System.out.println("1. Traditional for loop:");
        for (int i = 0; i < colors.size(); i++) {
            System.out.println("   " + colors.get(i));
        }

        // Method 2: Enhanced for loop (for-each)
        System.out.println("2. Enhanced for loop:");
        for (String color : colors) {
            System.out.println("   " + color);
        }

        // Method 3: Iterator
        System.out.println("3. Iterator:");
        Iterator<String> iterator = colors.iterator();
        while (iterator.hasNext()) {
            System.out.println("   " + iterator.next());
        }

        // Method 4: ListIterator (bidirectional)
        System.out.println("4. ListIterator (forward):");
        ListIterator<String> listIterator = colors.listIterator();
        while (listIterator.hasNext()) {
            System.out.println("   " + listIterator.next());
        }

        System.out.println("   ListIterator (backward):");
        while (listIterator.hasPrevious()) {
            System.out.println("   " + listIterator.previous());
        }

        // Method 5: forEach with lambda (Java 8+)
        System.out.println("5. forEach with lambda:");
        colors.forEach(color -> System.out.println("   " + color));

        // Method 6: Stream API (Java 8+)
        System.out.println("6. Stream API:");
        colors.stream().forEach(color -> System.out.println("   " + color));

        // ========== 7. CONVERTING ARRAYLIST ==========
        System.out.println("\n========== CONVERTING ARRAYLIST ==========");

        // toArray() - converts to Object array
        Object[] objectArray = colors.toArray();
        System.out.println("Object array: " + Arrays.toString(objectArray));

        // toArray(T[] a) - converts to typed array
        String[] stringArray = colors.toArray(new String[0]);
        System.out.println("String array: " + Arrays.toString(stringArray));

        // Converting to other collections
        List<String> unmodifiableList = Collections.unmodifiableList(colors);
        Set<String> set = new HashSet<>(colors);
        System.out.println("As Set: " + set);

        // ========== 8. SORTING AND SEARCHING ==========
        System.out.println("\n========== SORTING AND SEARCHING ==========");
        ArrayList<Integer> numbers = new ArrayList<>(List.of(5, 2, 8, 1, 9, 3));

        // sort() - natural order
        Collections.sort(numbers);
        System.out.println("Sorted numbers: " + numbers);

        // sort() with comparator
        numbers.sort(Collections.reverseOrder());
        System.out.println("Reverse sorted: " + numbers);

        // Binary search (requires sorted list)
        Collections.sort(numbers);
        int index = Collections.binarySearch(numbers, 5);
        System.out.println("Index of 5: " + index);

        // Custom comparator sorting
        ArrayList<String> words = new ArrayList<>(List.of("apple", "Banana", "cherry", "Date"));
        words.sort(String.CASE_INSENSITIVE_ORDER);
        System.out.println("Case-insensitive sort: " + words);

        // ========== 9. SUBLIST OPERATIONS ==========
        System.out.println("\n========== SUBLIST OPERATIONS ==========");
        ArrayList<Integer> numbers2 = new ArrayList<>(List.of(10, 20, 30, 40, 50, 60));

        // subList(int fromIndex, int toIndex) - view of portion
        List<Integer> subList = numbers2.subList(1, 4);
        System.out.println("Original: " + numbers2);
        System.out.println("SubList (1-4): " + subList);

        // Changes in sublist reflect in original
        subList.set(0, 200);
        System.out.println("After modifying sublist: " + numbers2);

        // ========== 10. OTHER USEFUL METHODS ==========
        System.out.println("\n========== OTHER USEFUL METHODS ==========");
        ArrayList<String> list = new ArrayList<>(List.of("A", "B", "C", "A", "B"));

        // ensureCapacity() - increases capacity
        ((ArrayList<String>) list).ensureCapacity(50);

        // trimToSize() - reduces capacity to current size
        ((ArrayList<String>) list).trimToSize();

        // clone() - creates shallow copy
        @SuppressWarnings("unchecked")
        ArrayList<String> clonedList = (ArrayList<String>) list.clone();
        System.out.println("Cloned list: " + clonedList);

        // equals() - compares with another list
        System.out.println("Equals clone? " + list.equals(clonedList));

        // hashCode()
        System.out.println("HashCode: " + list.hashCode());

        // ========== 12. SYNCHRONIZED ARRAYLIST ==========
        System.out.println("\n========== SYNCHRONIZED ARRAYLIST ==========");
        List<String> syncList = Collections.synchronizedList(new ArrayList<>());

        // Must synchronize during iteration
        synchronized (syncList) {
            syncList.add("Thread-safe");
            for (String item : syncList) {
                System.out.println(item);
            }
        }

        // ========== 13. PERFORMANCE EXAMPLE ==========
        System.out.println("\n========== PERFORMANCE COMPARISON ==========");

        // Adding at the end (fast)
        long start = System.nanoTime();
        ArrayList<Integer> performanceList = new ArrayList<>();
        for (int i = 0; i < 100000; i++) {
            performanceList.add(i);
        }
        long end = System.nanoTime();
        System.out.println("Time to add 100,000 elements: " + (end - start) / 1_000_000 + " ms");

        // Adding at beginning (slow)
        start = System.nanoTime();
        for (int i = 0; i < 1000; i++) {
            performanceList.add(0, i);
        }
        end = System.nanoTime();
        System.out.println("Time to add 1,000 at beginning: " + (end - start) / 1_000_000 + " ms");
    }
}

// Custom class for demonstration
class Person67 {
    private String name;
    private int age;

    public Person67(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() { return name; }
    public int getAge() { return age; }

    @Override
    public String toString() {
        return name + "(" + age + ")";
    }
}