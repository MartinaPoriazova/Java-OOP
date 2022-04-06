package pizzaCalories;

public class Topping {

    private String toppingType;
    private double weight;

    public Topping(String toppingType, double weight) {
        this.setToppingType(toppingType);
        this.weight = weight;
    }

    private void setToppingType(String toppingType) {
        if (toppingType.equals("Meat") || toppingType.equals("Veggies") || toppingType.equals("Cheese")
                || toppingType.equals("Sauce")) {
            this.toppingType = toppingType;
        } else {
            throw new IllegalArgumentException(String.format("Cannot place %s on top of your pizza.",
                    toppingType));
        }
    }

    private void setWeight(double weight) {
        if (weight >= 1 && weight <= 50) {
            this.weight = weight;
        } else {
            throw new IllegalArgumentException(String.format("%s weight should be in the range [1..50].",
                    this.toppingType));
        }
    }

    public double calculateCalories() {
        double modifier = 1.2;

        if (this.toppingType.equals("Veggies")) {
            modifier = 0.8;
        } else if (this.toppingType.equals("Cheese")) {
            modifier = 1.1;
        } else if (this.toppingType.equals("Sauce")) {
            modifier = 0.9;
        }

        return modifier * 2 * this.weight;
    }
}