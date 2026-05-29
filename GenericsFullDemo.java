package JavaByCoderArmy;
import java.util.*;
import java.util.List;
import java.util.Arrays;

// Main class
public class GenericsFullDemo {
    public static void main(String[] args) {

        // 1. Basic Generic Class
        Box1<Integer> intBox = new Box1<>(100);
        Box1<String> strBox = new Box1<>("Hydra");

        intBox.display();
        strBox.display();

        // 2. Multiple Type Parameters
        Pair1<Integer, String> pair = new Pair1<>(1, "One");
        pair.display();

        // 3. Bounded Generics (Only Numbers)
        NumberBox<Integer> nb1 = new NumberBox<>(50);
        NumberBox<Double> nb2 = new NumberBox<>(25.5);

        System.out.println("Sum (Integer): " + nb1.getDoubleValue());
        System.out.println("Sum (Double): " + nb2.getDoubleValue());

        // 4. Generic Method
        GenericMethod.printArray(new Integer[]{1, 2, 3, 4});
        GenericMethod.printArray(new String[]{"A", "B", "C"});

        // 5. Wildcards
        List<Integer> intList = Arrays.asList(1, 2, 3);
        List<Double> doubleList = Arrays.asList(1.1, 2.2, 3.3);

        WildcardDemo.printNumbers(intList);
        WildcardDemo.printNumbers(doubleList);

        // 6. Upper Bounded Wildcard
        System.out.println("Sum of list: " + WildcardDemo.sum(intList));

        // 7. Lower Bounded Wildcard
        List<Number> numList = new ArrayList<>();
        WildcardDemo.addNumbers(numList);

        System.out.println("After adding numbers: " + numList);

        // 8. Generic Class with Comparable Constraint
        MaxFinder<Integer> mf = new MaxFinder<>(10, 20, 15);
        System.out.println("Max: " + mf.getMax());
    }
}


// 1. Basic Generic Class
class Box1<T> {
    private T value;

    Box1(T value) {
        this.value = value;
    }

    public void display() {
        System.out.println("Value: " + value);
    }

    public T getValue() {
        return value;
    }
}


// 2. Multiple Type Parameters
class Pair1<K, V> {
    private K key;
    private V value;

    Pair1(K key, V value) {
        this.key = key;
        this.value = value;
    }

    public void display() {
        System.out.println("Key: " + key + ", Value: " + value);
    }
}


// 3. Bounded Generics (T must extend Number)
class NumberBox<T extends Number> {
    private T number;

        NumberBox(T number) {
        this.number = number;
    }

    public double getDoubleValue() {
        return number.doubleValue();
    }
}


// 4. Generic Methods
class GenericMethod {
    public static <T> void printArray(T[] arr) {
        for (T ele : arr) {
            System.out.print(ele + " ");
        }
        System.out.println();
    }
}


// 5,6,7. Wildcards
class WildcardDemo {

    // Unbounded wildcard
    public static void printNumbers(List<?> list) {
        for (Object obj : list) {
            System.out.print(obj + " ");
        }
        System.out.println();
    }

    // Upper bounded wildcard
    public static double sum(List<? extends Number> list) {
        double sum = 0;
        for (Number num : list) {
            sum += num.doubleValue();
        }
        return sum;
    }

    // Lower bounded wildcard
    public static void addNumbers(List<? super Integer> list) {
        list.add(10);
        list.add(20);
    }
}


// 8. Generic with Comparable (Advanced)
class MaxFinder<T extends Comparable<T>> {
    private T a, b, c;

    MaxFinder(T a, T b, T c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public T getMax() {
        T max = a;

        if (b.compareTo(max) > 0) max = b;
        if (c.compareTo(max) > 0) max = c;

        return max;
    }
}