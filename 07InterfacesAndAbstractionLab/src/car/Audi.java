package car;

public class Audi extends CarImpl implements Rentable {

    private final Integer minRentDays;
    private final Double pricePerDay;

    public Audi(String model,
            String color,
            Integer horsePower,
            String countryProduced,
            Integer minRentDays,
            Double pricePerDay) {
        super(model, color, horsePower, countryProduced);
        this.minRentDays = minRentDays;
        this.pricePerDay = pricePerDay;
    }

    @Override
    public Integer getMinRentDay() {
        return this.minRentDays;
    }

    @Override
    public Double getPricePerDay() {
        return this.pricePerDay;
    }

    @Override
    public String toString() {
        return String.format("Minimum rental period of %d days. Price per day %f",
                this.getMinRentDay(), this.getPricePerDay());
    }

    // @Override
    //    public String toString() {
    //        return super.toString() + System.lineSeparator()
    //               + "Minimum rental period of " + minRentDay + " days. Price per day " + pricePerDay;
    //    }
}
