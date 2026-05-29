//// ========================================================
//// COMPREHENSIVE JAVA METHODS (FUNCTIONS) DEMO
//// From BASIC to ADVANCED - All in ONE single file!
//// Save this as: FunctionsInJava.java
//// Compile: javac FunctionsInJava.java
//// Run:     java FunctionsInJava
////
//// This single file demonstrates EVERY major concept about
//// methods in Java (methods = functions in Java).
//// Detailed comments explain theory + usage at every level.
//// ========================================================
//
//import java.util.*;           // For ArrayList, Arrays, etc. (used in advanced demos)
//import java.util.function.*;  // For built-in functional interfaces (Java 8+)
//
//// ===================================================================
//// 1. BASIC METHODS
//// ===================================================================
//// Syntax:
//// [access_modifier] [static] [final] returnType methodName(parameterType paramName) { ... }
//// - access_modifier: public, protected, default (package-private), private
//// - static: belongs to class, not object
//// - final: cannot be overridden
//// - returnType: void or any data type (primitive or object)
//// - Method name follows camelCase convention
//// ===================================================================
//
//public class Functionsnew {
//
//    // Entry point - special method that JVM calls first
//    public static void main(String[] args) {
//        System.out.println("=== JAVA METHODS DEMO START ===");
//
//        // BASIC 1: Void static method (no parameters, no return)
//        greet();
//
//        // BASIC 2: Method with parameters + return value
//        int result = add(10, 20);
//        System.out.println("Basic add(10, 20) = " + result);
//
//        // BASIC 3: Instance method (needs object)
//        FunctionsInJava obj = new FunctionsInJava();
//        obj.instanceDemo();
//
//        // ===================================================================
//        // 2. METHOD OVERLOADING (Compile-time polymorphism)
//        // Same method name, different parameters (number, type, or order)
//        // ===================================================================
//        System.out.println("\n=== METHOD OVERLOADING ===");
//        System.out.println("add(5, 10)       = " + add(5, 10));
//        System.out.println("add(5, 10, 15)   = " + add(5, 10, 15));
//        System.out.println("add(2.5, 3.7)    = " + add(2.5, 3.7));
//        System.out.println("add(\"Hello\", \"World\") = " + add("Hello", "World"));
//
//        // ===================================================================
//        // 3. VARARGS (Variable Arguments) - Java 5+
//        // Allows passing 0 or more arguments of same type
//        // Must be the last parameter
//        // ===================================================================
//        System.out.println("\n=== VARARGS ===");
//        printAll(10, 20, 30);
//        printAll();                    // zero arguments
//        printAll(1, 2, 3, 4, 5, 6, 7);
//
//        // ===================================================================
//        // 4. RECURSION
//        // Method calls itself. Must have base case to avoid StackOverflow
//        // ===================================================================
//        System.out.println("\n=== RECURSION ===");
//        System.out.println("Factorial of 5 = " + factorial(5));
//
//        // ===================================================================
//        // 5. GENERIC METHODS (Type-safe reusable methods)
//        // ===================================================================
//        System.out.println("\n=== GENERIC METHODS ===");
//        Integer[] intArr = {1, 2, 3};
//        String[] strArr = {"Java", "is", "awesome"};
//        printArray(intArr);
//        printArray(strArr);
//
//        // ===================================================================
//        // 6. ACCESS MODIFIERS + FINAL + PRIVATE (encapsulation)
//        // ===================================================================
//        System.out.println("\n=== ACCESS MODIFIERS & FINAL ===");
//        // privateMethod() cannot be called from outside - demonstrates encapsulation
//        obj.publicMethodDemo();   // public
//        obj.finalMethodDemo();    // final method (cannot be overridden)
//
//        // ===================================================================
//        // 7. EXCEPTION HANDLING IN METHODS
//        // ===================================================================
//        System.out.println("\n=== EXCEPTION HANDLING IN METHODS ===");
//        try {
//            riskyMethod();
//        } catch (Exception e) {
//            System.out.println("Caught: " + e.getMessage());
//        }
//
//        // ===================================================================
//        // 8. INHERITANCE + METHOD OVERRIDING (Runtime polymorphism)
//        // ===================================================================
//        System.out.println("\n=== OVERRIDING & POLYMORPHISM ===");
//        Parent p = new Parent();
//        Child c = new Child();
//        p.show();           // Parent version
//        c.show();           // Child overridden version
//
//        // Upcasting (polymorphism)
//        Parent poly = new Child();
//        poly.show();        // Still calls Child's version (dynamic dispatch)
//
//        // ===================================================================
//        // 9. ABSTRACT METHODS (must be implemented by subclass)
//        // ===================================================================
//        System.out.println("\n=== ABSTRACT METHODS ===");
//        AbstractImpl impl = new AbstractImpl();
//        impl.abstractMethod();
//
//        // ===================================================================
//        // 10. INTERFACE METHODS (Java 8+)
//        // - abstract (must implement)
//        // - default (optional implementation)
//        // - static (called on interface)
//        // ===================================================================
//        System.out.println("\n=== INTERFACE METHODS ===");
//        MyInterface objInterface = new MyInterfaceImpl();
//        objInterface.abstractInterfaceMethod();   // must implement
//        objInterface.defaultMethod();             // from interface (Java 8)
//        MyInterface.staticInterfaceMethod();      // static, called on interface
//
//        // ===================================================================
//        // 11. LAMBDA EXPRESSIONS & FUNCTIONAL INTERFACES (Java 8+)
//        // A method can be treated as data (functional programming)
//        // ===================================================================
//        System.out.println("\n=== LAMBDA EXPRESSIONS & METHOD REFERENCES ===");
//
//        // Functional interface (only ONE abstract method)
//        MyFunctionalInterface lambda = (name) -> System.out.println("Lambda says: Hello " + name);
//        lambda.sayHello("Mahesh");
//
//        // Built-in functional interface example
//        Predicate<String> isLong = s -> s.length() > 5;
//        System.out.println("Is 'Java' long? " + isLong.test("Java"));
//
//        // Method Reference (shorthand for lambda)
//        List<String> names = Arrays.asList("Alice", "Bob", "Charlie");
//        names.forEach(System.out::println);   // :: = method reference
//
//        // ===================================================================
//        // 12. SYNCHRONIZED METHODS (Thread safety - multithreading)
//        // ===================================================================
//        System.out.println("\n=== SYNCHRONIZED METHOD (Thread-safe) ===");
//        // In real multi-threaded code this would lock the object
//        synchronizedDemo();
//
//        // ===================================================================
//        // END OF DEMO
//        // ===================================================================
//        System.out.println("\n=== JAVA METHODS DEMO COMPLETE ===");
//        System.out.println("You just saw BASIC → ADVANCED in ONE file!");
//        System.out.println("Key takeaway: In Java, everything is a method (no standalone functions).");
//    }
//
//    // ===================================================================
//    // BASIC STATIC VOID METHOD
//    // ===================================================================
//    public static void greet() {
//        System.out.println("Hello! This is a basic static method.");
//    }
//
//    // ===================================================================
//    // BASIC METHOD WITH PARAMETERS + RETURN
//    // ===================================================================
//    public static int add(int a, int b) {
//        return a + b;
//    }
//
//    // ===================================================================
//    // OVERLOADED METHODS (different signatures)
//    // ===================================================================
//    public static int add(int a, int b, int c) {
//        return a + b + c;
//    }
//
//    public static double add(double a, double b) {
//        return a + b;
//    }
//
//    public static String add(String a, String b) {
//        return a + b;
//    }
//
//    // ===================================================================
//    // VARARGS METHOD
//    // ===================================================================
//    public static void printAll(int... numbers) {
//        System.out.print("Varargs received: ");
//        for (int n : numbers) {
//            System.out.print(n + " ");
//        }
//        System.out.println("(total: " + numbers.length + ")");
//    }
//
//    // ===================================================================
//    // RECURSIVE METHOD
//    // ===================================================================
//    public static int factorial(int n) {
//        if (n <= 1) return 1;           // base case
//        return n * factorial(n - 1);    // recursive call
//    }
//
//    // ===================================================================
//    // GENERIC METHOD (works with any type T)
//    // ===================================================================
//    public static <T> void printArray(T[] array) {
//        System.out.print("Generic array: ");
//        for (T item : array) {
//            System.out.print(item + " ");
//        }
//        System.out.println();
//    }
//
//    // ===================================================================
//    // INSTANCE METHOD
//    // ===================================================================
//    public void instanceDemo() {
//        System.out.println("This is an instance (non-static) method.");
//    }
//
//    // ===================================================================
//    // PUBLIC METHOD (accessible everywhere)
//    // ===================================================================
//    public void publicMethodDemo() {
//        System.out.println("Public method called");
//        privateMethodDemo();   // private methods are accessible inside same class
//    }
//
//    // ===================================================================
//    // PRIVATE METHOD (only inside this class)
//    // ===================================================================
//    private void privateMethodDemo() {
//        System.out.println("   → Private method called (encapsulation in action)");
//    }
//
//    // ===================================================================
//    // FINAL METHOD (cannot be overridden in subclass)
//    // ===================================================================
//    public final void finalMethodDemo() {
//        System.out.println("Final method - cannot be overridden by any child class");
//    }
//
//    // ===================================================================
//    // METHOD THAT THROWS EXCEPTION
//    // ===================================================================
//    public static void riskyMethod() throws Exception {
//        throw new Exception("This is a checked exception thrown from method");
//    }
//
//    // ===================================================================
//    // SYNCHRONIZED METHOD (thread-safe)
//    // ===================================================================
//    public static synchronized void synchronizedDemo() {
//        System.out.println("Synchronized method - only one thread can execute this at a time");
//    }
//
//    // ===================================================================
//    // NESTED CLASSES FOR INHERITANCE / OVERRIDING DEMO
//    // ===================================================================
//    static class Parent {
//        void show() {
//            System.out.println("Parent class method");
//        }
//    }
//
//    static class Child extends Parent {
//        @Override
//        void show() {                         // Method overriding
//            System.out.println("Child class - overridden method (runtime polymorphism)");
//        }
//    }
//
//    // ===================================================================
//    // ABSTRACT CLASS + ABSTRACT METHOD
//    // ===================================================================
//    abstract static class AbstractDemo {
//        abstract void abstractMethod();       // no body - must be implemented
//    }
//
//    static class AbstractImpl extends AbstractDemo {
//        @Override
//        void abstractMethod() {
//            System.out.println("Abstract method implemented in concrete class");
//        }
//    }
//
//    // ===================================================================
//    // INTERFACE WITH ALL TYPES OF METHODS (Java 8+)
//    // ===================================================================
//    interface MyInterface {
//        void abstractInterfaceMethod();       // abstract (must implement)
//
//        default void defaultMethod() {        // default implementation (Java 8)
//            System.out.println("Default method from interface - no need to override");
//        }
//
//        static void staticInterfaceMethod() { // static method (Java 8)
//            System.out.println("Static method inside interface - called on interface name");
//        }
//    }
//
//    static class MyInterfaceImpl implements MyInterface {
//        @Override
//        public void abstractInterfaceMethod() {
//            System.out.println("Implemented abstract method from interface");
//        }
//    }
//
//    // ===================================================================
//    // FUNCTIONAL INTERFACE + LAMBDA SUPPORT
//    // ===================================================================
//    @FunctionalInterface
//    interface MyFunctionalInterface {
//        void sayHello(String name);   // exactly ONE abstract method
//    }
//}