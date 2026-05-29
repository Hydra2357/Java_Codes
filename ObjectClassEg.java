package JavaByCoderArmy;
import java.util.Objects;

class Student3 extends Object implements Cloneable {
    String name;
    int age;

    @Override
    public String toString() {
        System.out.println(name + " with age : " + age);
        return (name + " " + age);
    }
    @Override
    public boolean equals(Object obj) {
        if(this == obj) return true;
        if(obj == null) {
            return false;
        }
        if(obj.getClass() != this.getClass()) {
            return false;
        }
        Student3 s7 = (Student3) obj;
        return ((this.name == s7.name) && (this.age == s7.age));
    }
    @Override
    public int hashCode() {
//        int resukt = 34;
//        int res = resukt * 31 + age;
//        res = resukt * 31 + name.hashCode();
//        return res;

        return Objects.hash(name, age);
    }

    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
}

public class ObjectClassEg {
    public static void main(String[] args) throws CloneNotSupportedException{
        Student3 s4 = new Student3();
        s4.name = "I am a student";
        System.out.println(s4.name);
        s4.age = 56;
        System.out.println(s4.age);
        System.out.println("\n");

        System.out.println(s4.toString());
        Student3 s5 = new Student3();
        s5.name = "I am a student";
        s5.age = 56;

        System.out.println("\n");
        System.out.println(s5.equals(s4));

        Student3 s9 = null;
        System.out.println(s5.equals(s9));

        Integer i = 34;
        System.out.println(s5.equals(i));

        System.out.println(s5.hashCode() == s4.hashCode());
        System.out.println(s5.getClass().getName());
        System.out.println(s4.getClass().getName());

        System.out.println(s5 instanceof Student3);
        System.out.println(s5 instanceof Object);

        Student3 s6 = (Student3) s5.clone();
        System.out.println(s6.name);
        System.out.println(s6.age);

    }
}

