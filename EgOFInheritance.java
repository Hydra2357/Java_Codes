package JavaByCoderArmy;

public class EgOFInheritance {
    public static void main(String[] args) {
        EngStudent e1 = new EngStudent("Mahesh", 23, "yjt");
        e1.markAttendance();
        e1.attendLab();

        e1.name = "Ada";
        e1.age = 23;
        e1.college = "iit";
        e1.print();

        System.out.println(e1.x);
        System.out.println(((StudentAll)e1).x);

        StudentAll s1 = new StudentAll("Ram", 20);
        s1.markAttendance();

        CSEStudent c1 = new CSEStudent("Shyam", 22, "IIT");
        c1.attendcselab();
    }
}

class StudentAll {
    String name;
    int age;
    int x = 45;

    public StudentAll(String nm, int age) {
        this.name = nm;
        this.age = age;
    }

    void print() {
        System.out.println(name + ", " + age + ", " + name);
    }

    protected void markAttendance() {
        System.out.println("Attendance marked...");
    }
}

class EngStudent extends StudentAll {
    String college;
    int x = 56;

    EngStudent(String nm, int age, String college) {
        super(nm, age);   // ✅ FIXED
        this.college = college;
    }

    void print() {
        super.print();
        System.out.println(college);
    }

    void attendLab() {
        System.out.println("Lab attended...");
    }
}

class CSEStudent extends EngStudent {
    CSEStudent(String nm, int age, String college) {
        super(nm, age, college);
    }

    void attendcselab() {
        System.out.println("CS attended...");
    }
}