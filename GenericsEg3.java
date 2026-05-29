package JavaByCoderArmy;

public class GenericsEg3 {
    public static void main(String[] args) {
        NewBox<Integer> b1 = new NewBox<>();
    }
}
class NewBox<T extends Number> {
    T value;

    public void printDoulbe() {
        System.out.println(value.doubleValue());

    }
}