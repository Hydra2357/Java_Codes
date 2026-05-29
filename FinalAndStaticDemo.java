package JavaByCoderArmy;

public class FinalAndStaticDemo {   // Main public class (single file)

    public static final double PI = 3.14159;
    public static int objectCount = 0;
    final double piInstance;   // Blank final instance variable
    final String companyName = "xAI Demo";

    static {
        System.out.println(">>> STATIC BLOCK executed (class loading time)");
        objectCount = 999;   // Initialize/modify static variable
        System.out.println("   Static objectCount initialized to: " + objectCount);
    }

    public FinalAndStaticDemo() {
        this.piInstance = 3.14;   // Original-style initialization of blank final
        objectCount++;            // Increment static counter
        System.out.println(">>> Constructor called - Blank final piInstance set to " + piInstance);
    }

    public static void staticMethodDemo() {
        System.out.println("\n>>> STATIC METHOD called (no object needed)");
        System.out.println("    Access to static final PI: " + PI);
        System.out.println("    Current static objectCount: " + objectCount);
        // System.out.println(piInstance); // ← Compile error (non-static)
    }

    public final void finalMethodDemo() {
        System.out.println(">>> FINAL METHOD executed - This cannot be overridden by any subclass");
    }

    public void methodWithFinalParameter(final int finalParam, int normalParam) {
        System.out.println(">>> Method with final parameter → finalParam = " + finalParam);
        // finalParam = 999;   // ← Compile error: cannot assign a value to final variable
        normalParam = 888;     // Normal parameter can be changed
        System.out.println("    Normal parameter was modified to: " + normalParam);
    }

    public static void main(String[] args) {

        System.out.println("====================================================");
        System.out.println("   DEMONSTRATION OF static & final KEYWORDS (Single File)");
        System.out.println("====================================================");

        // 1. Static final constant (no object needed)
        System.out.println("\n1. Static final constant PI = " + FinalAndStaticDemo.PI);

        // 2. Static method call (no object needed)
        FinalAndStaticDemo.staticMethodDemo();

        // 3. Create object → triggers constructor + static block (already ran once)
        System.out.println("\n2. Creating objects...");
        FinalAndStaticDemo obj1 = new FinalAndStaticDemo();

        // 4. Access final instance variables
        System.out.println("   obj1.piInstance (blank final) = " + obj1.piInstance);
        System.out.println("   obj1.companyName (final) = " + obj1.companyName);

        // 5. Local final variable (exactly like original code's "final int x")
        final int localFinalX;     // Blank local final
        localFinalX = 4;           // Must be initialized before use (like original)
        System.out.println("   Local final variable x = " + localFinalX);
        // localFinalX = 5;        // ← Compile error

        // 6. Static counter after object creation
        System.out.println("   Static objectCount (shared) = " + FinalAndStaticDemo.objectCount);

        // 7. Final parameter demonstration
        obj1.methodWithFinalParameter(123, 456);

        // 8. Final method call
        obj1.finalMethodDemo();

        // 9. Create second object to prove static variable is shared
        FinalAndStaticDemo obj2 = new FinalAndStaticDemo();
        System.out.println("\n3. Second object created → Static objectCount is now: "
                + FinalAndStaticDemo.objectCount);

        System.out.println("\n4. FINAL CLASS (cannot be extended):");
        FinalClass finalClassObj = new FinalClass();
        finalClassObj.display();

        System.out.println("\n5. Inheritance with final method:");
        Child child = new Child();
        child.cannotBeOverridden();   // Calls parent's final method
        child.canBeOverridden();      // Calls overridden normal method

        System.out.println("\n6. STATIC NESTED CLASS:");
        Outer.StaticNestedClass.staticNestedDemo();

        System.out.println("\n====================================================");
        System.out.println("   ALL static & final features demonstrated successfully!");
        System.out.println("====================================================");
    }
}

final class FinalClass {
    public void display() {
        System.out.println("   → This is a FINAL class. No one can inherit from me.");
    }
}

class Parent {
    // Final method → child classes CANNOT override it
    public final void cannotBeOverridden() {
        System.out.println("   → Parent's FINAL method (cannot be overridden by Child)");
    }

    // Normal method → can be overridden
    public void canBeOverridden() {
        System.out.println("   → Parent's normal method");
    }
}

class Child extends Parent {
    // cannotBeOverridden() cannot be written here → compile error

    @Override
    public void canBeOverridden() {
        System.out.println("   → Child successfully overrode the normal method");
    }
}

class Outer {
    static class StaticNestedClass {
        public static void staticNestedDemo() {
            System.out.println("   → Static nested class method called (no outer object needed)");
        }
    }
}