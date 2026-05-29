package JavaByCoderArmy;

public class AbstractClass {
    public static void main(String[] args) {
        Animal a1 = new Dog("MAx the dog");
        a1.makeSound();
    }
}

//abstract cannot be used with:
//→ final, private, static, synchronized, native, strictfp
//final cannot be used with:
//→ abstract (class/method), volatile (variable)

abstract class Animal {
    String name1;
    static String type;

    abstract void makeSound();

    Animal(String name1) {
        this.name1 = name1;
    }
    final void sleep() {
        System.out.println("Sleeping...");
    }
    static void eat() {
        System.out.println("Eating...");
    }

    private void isEatingGrass() {
        System.out.println("Eating grass...");
    }
}

class Dog extends Animal {

    Dog(String name1) {
        super(name1);
    }

    @Override
    void makeSound() {
        System.out.println("Making barking sound...");
    }
}