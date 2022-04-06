package vehiclesextended;

public class Car extends Vehicle {

    private static final double AIR_CONDIT_CONSUMPTION = 0.9;

    public Car(double fuel, double consumption, double tankCapacity) {
        super(fuel, consumption + AIR_CONDIT_CONSUMPTION, tankCapacity);
    }
}
