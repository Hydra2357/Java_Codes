package JavaByCoderArmy;

public class ImmutableClassEg {
    public static void main(String[] args) {

        Collage2 c2 = new Collage2("IITG", "Assam");
        System.out.println(c2.name);
        System.out.println(c2.address);

        Student2 s2 = new Student2(23 ,"Hydra404", c2);
        System.out.println(s2.getAge());
        System.out.println(s2.getName());
        System.out.println(s2.getCollage());

        System.out.println("\n");
        System.out.println(s2.getCollage().name);
        s2.getCollage().name = "IIT B";
        System.out.println(s2.getCollage().name);

    }
}
// Immutable class
class Student2 {
    private final int age;
    private final String name;
    private final Collage2 collage;

    Student2(int age, String name, Collage2 collage) {
        this.age = age;
        this.name = name;
        this.collage = collage;
    }
    public int getAge() {
        return age;
    }
    public String getName() {
        return name;
    }
    public Collage2 getCollage() {
        return collage;
    }

}
class Collage2 {
    String name;
    String address;

    Collage2(String name, String address) {
        this.name = name;
        this.address = address;
    }
}

