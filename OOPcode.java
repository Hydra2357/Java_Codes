package JavaByCoderArmy;

public class OOPcode {
    public static void main(String[] args) {

        // Creating objects using different constructors
        Student s1 = new Student();                    // Default constructor
        Student s2 = new Student();                    // Default constructor

        Student s3 = new Student("Aman");                    // Only name
        Student s4 = new Student("Rohit", 23, 45);           // Name, rollNum, age
        Student s5 = new Student("Rohit", 23, 45, "IIT Bombay"); // All parameters

        // Display some values
        System.out.println("s3 Name: " + s3.name);
        System.out.println("s3 Roll Number: " + s3.rollNum);
        System.out.println("--------------------------------");

        // Calling methods
        s1.markAttendance();
        s2.markAttendance();
        System.out.println("--------------------------------");

        // Printing complete details
        System.out.println("Student s3 Details:");
        s3.print();

        System.out.println("\nStudent s4 Details:");
        s4.print();

        System.out.println("\nStudent s5 Details:");
        s5.print();
    }
}

class Student {
    String name;
    int rollNum;
    int age;
    String collage;        // Note: Spelling should be "college"

    // Default Constructor
    Student() {
        // You can set default values here if needed
        this.name = "Unknown";
        this.rollNum = 0;
        this.age = 0;
        this.collage = "Not Assigned";
    }

    // Constructor with only name
    Student(String name) {
        this(name, 0, 0, null);
    }

    // Constructor with name, rollNum, age
    Student(String name, int rollNum, int age) {
        this(name, rollNum, age, null);
    }

    // Main Constructor (Constructor Chaining)
    Student(String name, int rollNum, int age, String collage) {
        this.name = name;
        this.rollNum = rollNum;
        this.age = age;
        this.collage = (collage != null) ? collage : "Not Assigned";
    }

    void markAttendance() {
        if (name != null && !name.equals("Unknown")) {
            System.out.println("Attendance marked for: " + name);
        } else {
            System.out.println("Attendance marked for: Unknown Student");
        }
    }

    void print() {
        System.out.println("Name       : " + name);
        System.out.println("Roll Number: " + rollNum);
        System.out.println("Age        : " + age);
        System.out.println("College    : " + collage);
        System.out.println("-------------------------------");
    }
}