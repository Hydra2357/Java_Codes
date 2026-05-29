package JavaByCoderArmy;

public class Banking {
    public static void main(String[] args) {
        BankAccount b1 = new BankAccount();
        b1.balance = 10000.00;

        b1.deposit(500);
        System.out.println(b1.balance);
        b1.withdraw(300);
        System.out.println(b1.balance);

    }
}

class BankAccount {
    double balance;

    public void deposit(int amount) {
        balance += amount;
    }
    public void withdraw(int amount) {
        if (balance >= amount) {
            balance -= amount;
        }else {
            System.out.println("Insufficient funds");
        }
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

}

class StudentNew {
    private String name;
    private int rollnumber;
    private int age;
    private String college;

    StudentNew(String nm, int rn, int ag, String clg) {
        this.name = nm;
        this.rollnumber = rn;
        this.age = ag;
        this.college = clg;
    }

    public String getName(){
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public int getRollnumber(){
        return rollnumber;
    }

    public void setRollnumber(int rollnumber) {
        if (1 <= rollnumber && rollnumber <= 100) {
            this.rollnumber = rollnumber;
        }else  {
            System.out.println("Please enter the valid rollNumber");
        }
    }
    public int getAge() {
        return age;
    }
    public void setAge(int age) {
        if (1<= age && age <= 100) {
            this.age = age;
        }else {
            System.out.println("Please enter the valid age");
        }
    }
    public String getCollege() {
        return college;
    }
    public void setCollege(String college) {
        this.college = college;
    }

}