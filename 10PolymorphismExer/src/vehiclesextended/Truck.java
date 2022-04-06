package vehiclesextended;

public class Truck extends Vehicle {

    private static final double AIR_CONDIT_CONSUMPTION = 1.6;

    public Truck(double fuel, double consumption, double tankCapacity) {
        super(fuel, consumption + AIR_CONDIT_CONSUMPTION, tankCapacity);
    }

    @Override
    public void refuel(double liters) {
        super.refuel(liters * 0.95);
    }
}
