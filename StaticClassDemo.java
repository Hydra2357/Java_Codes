package JavaByCoderArmy;

public class StaticClassDemo {

    public static void main(String[] args) {

        // 1. Static Nested Class Example
        outer o1 = new outer();

        // Correct way to create instance of static nested class
        outer.inner i1 = new outer.inner(o1);   // No need for outer instance, but we passed it
        i1.fun(o1);

        // 2. Non-static Inner Class Example
        Outer2 outer2 = new Outer2();
        Outer2.Inner2 i2 = outer2.new Inner2();   // Correct syntax
        i2.todo();

        // 3. Static Nested Class for Utility (BankAccount example)
        BankAccount1 account = new BankAccount1();
        System.out.println("Interest: " + account.computeInterest(10000));
    }
}

// ==================== Outer with Static Nested Class ====================
class outer {
    static int x = 4;      // static variable
    int y = 10;            // instance variable

    // Static Nested Class
    static class inner {
        outer onew;

        inner(outer onew) {
            this.onew = onew;
        }

        void fun(outer o1) {
            System.out.println("Hello from static nested class...");
            System.out.println("Static variable x = " + x);           // can access static members directly
            System.out.println("Instance variable y = " + o1.y);      // needs outer instance reference
        }
    }
}

// ==================== Non-static Inner Class Example ====================
class Outer2 {
    int x2 = 23;           // outer class instance variable

    // Non-static Inner Class (Regular Inner Class)
    class Inner2 {
        int x2 = 3;        // shadows outer class variable

        void todo() {
            System.out.println("Outer class static x = " + outer.x);
            System.out.println("Outer2 instance x2 = " + Outer2.this.x2);  // using Outer2.this
            System.out.println("Inner2 local x2 = " + this.x2);
        }
    }
}

// ==================== Real-world use of Static Nested Class ====================
class BankAccount1 {

    // Static nested class - good for utility/helper classes
    static class InterestCalculator {
        static double calculateYearly(double principal, double rate) {
            return principal * rate;
        }
    }

    public double computeInterest(double principal) {
        // Calling static method of static nested class
        return InterestCalculator.calculateYearly(principal, 0.09);
    }
}