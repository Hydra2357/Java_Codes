package JavaByCoderArmy;

interface Greeting {
    void sayHello();
}

public class AnonymousClass {
    public static void main(String[] args) {
        Person p1 = new Person();
        p1.introduce();

        Person p2 = new Person() {
            String name = "Hydra";
            @Override
            void introduce() {
                greet();
                System.out.println("Hi, i am " + name);
            }
            void greet() {
                System.out.println("Hello...");
            }
        };
        p2.introduce();

        Greeting g1 = new Greeting() {
            @Override
            public void sayHello() {
                System.out.println("hello from anonymous class...!");
            }
        };
        g1.sayHello();
    }
}
class Person {
    void introduce() {
        System.out.println("Hi, i am a Person...");
    }
}
