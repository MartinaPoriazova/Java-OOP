package vehiclesextended;

import java.text.DecimalFormat;

public abstract class Vehicle {

    private double fuel;
    private double consumption;
    private double tankCapacity;

    protected Vehicle(double fuel, double consumption, double tankCapacity) {
        this.tankCapacity = tankCapacity;
        this.setFuel(fuel);
        this.consumption = consumption;

    }

    protected void addConsumption(double additionalConsumption) {
        this.consumption += additionalConsumption;
    }

    protected void substractConsumption(double substraction) {
        this.consumption -= substraction;
    }

    private void setFuel(double fuel) {
        validateNonNegativeFuel(fuel);
        validateHasEnoughFreeTankCapacity(fuel);
        this.fuel = fuel;
    }

    private void validateNonNegativeFuel(double fuel) {
        if (fuel <= 0) {
            throw new IllegalArgumentException("Fuel must be a positive number");
        }
    }

    private void validateHasEnoughFreeTankCapacity(double additionalFuel) {
        if (additionalFuel > this.tankCapacity) {
            throw new IllegalArgumentException("Cannot fit fuel in tank");
        }
    }

    public String drive(double distance) {
        double fuelNeeded = distance * this.consumption;
        if (fuelNeeded > this.fuel) {
            return this.getClass().getSimpleName() + " needs refueling";
        }
        this.setFuel(this.fuel - fuelNeeded);

        DecimalFormat formatter = new DecimalFormat("##.##");

        return String.format("%s travelled %s km", this.getClass().getSimpleName(),
                formatter.format(distance));
    }

    public void refuel(double litters) {
        validateNonNegativeFuel(fuel);
        validateHasEnoughFreeTankCapacity(fuel);
        this.setFuel(this.fuel + litters);
    }

    @Override
    public String toString() {
        return String.format("%s: %.2f", this.getClass().getSimpleName(), this.fuel);
    }
}
