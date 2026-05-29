package JavaByCoderArmy;

interface VehicleNew {

    // If w apply the default keyword then we can define the method in interface.
    default void drive() {
        System.out.println("Driving Vehicle");
        accelerate();
    }
    static void brake() {
        System.out.println("Braking Vehicle");
    }
    private void accelerate() {
        System.out.println("Accelerating Vehicle");
    }
}
//List interface --> arraylist, linedList

public class InterfaceChangesInAfterJava8 {
    public static void main(String[] args) {
        VehicleNew v2 = new CarNew();
        v2.drive();
        VehicleNew.brake();

        VehicleNew v3 = new Bike();
        v3.drive();
    }
}

class CarNew implements VehicleNew {
    @Override
    public void drive() {
        System.out.println("Car is driving...");
    }
}
class Bike implements VehicleNew {

}