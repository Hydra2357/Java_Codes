package JavaByCoderArmy;

public class ObjandClass {
    public static void main(String[] args) {
        Ramdom r1 = new Ramdom(4 ,5);
        Ramdom r2 = new Ramdom(r1);

        System.out.println("Ramdom: " + r1.x +", " + r1.y);
        addfunction(r1);
        System.out.println("Ramdom: " + r1.x +", " + r1.y);

    }
    static void addfunction(Ramdom r) {
        r.x = r.x +10;
        r.y = r.y +10;
    }
}
class Ramdom {
    int x;
    int y;

    Ramdom(int x, int y) {
        this.x = x;
        this.y = y;
    }
    Ramdom(Ramdom r) {
        this.x = r.x;
        this.y = r.y;
    }

    public boolean Pi() {
        return false;
    }

}
