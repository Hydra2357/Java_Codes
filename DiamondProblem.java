package JavaByCoderArmy;

public class DiamondProblem {
    public static void main(String[] args) {
        D d1 = new D();
        d1.fun();
    }
}
interface A {
    void fun();
}
interface B extends A {
    default void fun() {
        System.out.println("B");
    }
}
interface C extends A {
    default void fun() {
        System.out.println("C");
    }
}
class D implements B, C {
    @Override
    public void fun() {
        System.out.println("D");
        B.super.fun();
        C.super.fun();
    }
}