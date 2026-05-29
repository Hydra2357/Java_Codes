package JavaByCoderArmy;

public class MathConstUse {
    public static void main(String[] args) {
        IMathConst m1 = new Random();
        m1.fun();

        System.out.print("This is using the main function: ");
        System.out.println(IMathConst.PI_VALUE);
    }
}
interface IMathConst {
    double PI_VALUE = 3.14;
    int VALUE = 10;

    void  fun();
}
class Random implements IMathConst {
    @Override
    public void fun() {
        System.out.println("The PI value using Math constant: " + PI_VALUE);

    }
}
// The multiple inheritance is supported by using interface.