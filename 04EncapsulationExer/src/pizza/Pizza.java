package pizza;

import java.util.ArrayList;
import java.util.List;

public class Pizza {

    private String name;
    private Dough dough;
    private List<Topping> toppings;
    private int numberOfToppings;

    public Pizza(String name, int numberOfToppings) {
        this.setName(name);
        this.setToppings(numberOfToppings);
        this.toppings = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    private void setName(String name) {
        if (name.trim().isEmpty() || name.length() > 15) {
            throw new IllegalArgumentException("Pizza name should be between 1 and 15 symbols.");
        }
        this.name = name;
    }

    private void setToppings(int numberOfToppings) {
        if (numberOfToppings >= 0 && numberOfToppings <= 10) {
            this.numberOfToppings = numberOfToppings;
        } else {
            throw new IllegalArgumentException("Number of toppings should be in range [0..10].");
        }
    }

    public void setDough(Dough dough) {
        this.dough = dough;
    }

    public void addTopping(Topping topping) {
        if (topping != null) {
            this.toppings.add(topping);
            this.numberOfToppings++;
        }
    }

    public double getOverallCalories() {
        double totalCalories = this.toppings.stream().mapToDouble(Topping::calculateCalories).sum();
        totalCalories += this.dough.calculateCalories();
        return totalCalories;
    }
}
