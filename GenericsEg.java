package JavaByCoderArmy;

public class GenericsEg {
    public static void main(String[] args) {
        Box<Integer> b1 = new Box<Integer>(10);
        Box<String> b2 = new Box<String>("Hello");
        Box<Boolean> b3 = new Box<>(true);

        System.out.println(b1);
        System.out.println(b2);
        System.out.println(b3);
        System.out.println();

        System.out.println(b1.getValue() + 5);
        System.out.println(b2.getValue() + 5);
        System.out.println(b3.getValue());

        Pair<Integer, String> p1 = new Pair<>(20, "Mahesh");
        System.out.println(p1.first + ", " + p1.second);
        System.out.println();

        Box2<Integer> b5 = new Box2<>();
        b5.value = 56;
        b5.printDouble();
    }
}

//whre the T is tpye parameter
class Box<T> {
    private T value;
    Box(T value) {
        this.value = value;
    }

    public T getValue() {
        return this.value;
    }
    public void setValue(T value) {
        this.value = value;
    }
    @Override
    public String toString() {
        return String.valueOf(value);
    }
}

class Pair<T, U> {
    T first;
    U second;

    Pair(T first, U second) {
        this.first = first;
        this.second = second;
    }
}

class Box2<T extends Number> {
    T value;

    public void printDouble() {
        System.out.println(value.doubleValue());

    }
}