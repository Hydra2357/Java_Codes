package JavaByCoderArmy;

public class ImmutableClassEg2 {
    public static void main(String[] args) {

        Collage23 c2 = new Collage23("IITG", "Assam");

        Student23 s2 = new Student23(23, "Hydra404", c2);
        System.out.println(s2.getCollage().name);
        s2.getCollage().name = "IIT B";
        System.out.println(s2.getCollage().name);

    }
}

// Immutable class
final class Student23 {
    private final int age;
    private final String name;
    private final Collage23 collage;

    Student23(int age, String name, Collage23 collage) {
        this.age = age;
        this.name = name;
        this.collage = new Collage23(collage.name, collage.address);
    }

    public int getAge() {
        return age;
    }

    public String getName() {
        return name;
    }

    public Collage23 getCollage() {
        return new Collage23(this.collage.name, this.collage.address);
    }

}

class Collage23 {
    String name;
    String address;

    Collage23(String name, String address) {
        this.name = name;
        this.address = address;
    }
}

