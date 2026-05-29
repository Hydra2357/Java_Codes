package JavaByCoderArmy;

public class InterfacesDeepDive {
    public static void main(String[] args) {
//        Thar t1 = new Thar();
//        Thar t2 = new Thar();
//        t1.drive();
        ICar c1 = new BlackThar();
        c1.drive();
    }
}
interface ICar {
    void drive();
}
abstract class Thar implements ICar {
    abstract public void drive();
//    @Override
//    public void drive() {
//        System.out.println("Thar model X");
//    }
}
class BlackThar implements ICar {
    @Override
    public void drive() {
        System.out.println("Black thar model X");
    }
}