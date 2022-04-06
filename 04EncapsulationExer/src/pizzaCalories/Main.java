package pizzaCalories;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        String[] pizzaInfo = s.nextLine().split("\\s+");
        String pizzaName = pizzaInfo[1];
        int numberOfToppings = Integer.parseInt(pizzaInfo[2]);

        Pizza pizza;
        try {
            pizza = new Pizza(pizzaName, numberOfToppings);
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
            return;
        }

        String[] doughInfo = s.nextLine().split("\\s+");
        String flourType = doughInfo[1];
        String bakingTechnique = doughInfo[2];
        double weightInGrams = Double.parseDouble(doughInfo[3]);

        Dough dough;
        try {
            dough = new Dough(flourType, bakingTechnique, weightInGrams);
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
            return;
        }

        if (pizza != null) {
            pizza.setDough(dough);
        }

        String input = s.nextLine();

        while (!input.equals("END")) {
            String toppingType = input.split("\\s+")[1];
            double toppingWeight = Double.parseDouble(input.split("\\s+")[2]);

            Topping topping = null;

            try {
                topping = new Topping(toppingType, toppingWeight);
            } catch (IllegalArgumentException e) {
                System.out.println(e.getMessage());
                return;
            }

            if (pizza != null) {
                pizza.addTopping(topping);
            }
            input = s.nextLine();
        }
        if (pizza != null) {
            System.out.printf("%s - %.2f%n", pizza.getName(), pizza.getOverallCalories());
        }
    }
}