package JavaByCoderArmy;

public class StaticKeyword {
    public static void main(String[] args) {
        Student1 s1 = new Student1("adi", 23, 121);
        Student1 s2 = new Student1("hydra", 24, 122);

//        Student1.college = "Random clg";

        System.out.println(s1.name + ", " + s1.age + ", " + s1.rollno + "," + Student1.college);
        System.out.println(s2.name + ", " + s2.age + ", " + s2.rollno + "," + Student1.college);
    }
}
class Student1 {
    String name;
    int age;
    int rollno;
    static String college;

    Student1(String name, int age, int rollno){
        this.name = name;
        this.age = age;
        this.rollno = rollno;
    }

    //Static block
    static {
        college = "Random clg";
    }
}