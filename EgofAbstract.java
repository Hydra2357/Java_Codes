package JavaByCoderArmy;

public class EgofAbstract {
    public static void main(String[] args) {
        Car c1 = new FuelCar();
        c1.start();
        c1.accelerate();
        c1.breaking();
    }
}

abstract class Car {
    void start() {
        System.out.println("Car starting...");
    }
    abstract void accelerate();
    abstract void breaking();
}

class FuelCar extends Car {
    @Override
    void accelerate() {
        System.out.println("Fuel Car accelerate...");
    }
    @Override
    void breaking() {
        System.out.println("Fuel Car breaking...");
    }

}
class ElectricCar extends Car {
    @Override
    void accelerate() {
        System.out.println("Electric Car accelerate...");
    }
    @Override
    void breaking() {
        System.out.println("Electric Car breaking...");
    }
}