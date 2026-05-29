package JavaByCoderArmy;

import java.util.ArrayList;
import java.util.List;

public class wildcardsGenerics1 {
    public static void main(String[] args) {
        Animal1 a1 = new Dog1();
        a1.eat();
        a1.walk();

//        List<Dog1> d1 = new ArrayList<>();
//        List<Animal1> d2 = dogs;

        Dog1[] d1 = new Dog1[10];
        Animal1[] aniobj = d1;

        aniobj[0] = new Animal1();

        for(Animal1 a2 : aniobj){
            a2.eat();
        }

    }
}

class Animal1 {
    void eat() {
        System.out.println("Eating...");
    }

    void walk() {
        System.out.println("walking from Animal class");
    }
}

class Dog1 extends Animal1 {
    void bark() {
        System.out.println("Barking from DOg class");
    }
}