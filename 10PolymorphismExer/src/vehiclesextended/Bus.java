package vehiclesextended;

public class Bus extends Vehicle {

    private static final double AIR_CONDIT_CONSUMPTION = 1.4;

    public Bus(double fuel, double consumption, double tankCapacity) {
        super(fuel, consumption, tankCapacity);
    }

    public String driveWithPassengers(double distance) {
        super.addConsumption(AIR_CONDIT_CONSUMPTION);
        String out = super.drive(distance);
        super.substractConsumption(AIR_CONDIT_CONSUMPTION);
        return out;
    }
}
