package pizza;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] pizzaInfo = scanner.nextLine().split("\\s+");
        String pizzaName = pizzaInfo[1];
        int numberOfToppings = Integer.parseInt(pizzaInfo[2]);

        Pizza pizza;
        try {
            pizza = new Pizza(pizzaName, numberOfToppings);
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
            return;
        }

        String[] ingredientsInfo = scanner.nextLine().split("\\s+");
        String flourType = ingredientsInfo[1];
        String bakingTechnique = ingredientsInfo[2];
        int weightInGrams = Integer.parseInt(ingredientsInfo[3]);

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

        String input = scanner.nextLine();

        while (!input.equals("END")) {
            String toppingType = input.split("\\s+")[1];
            double toppingWeight = Double.parseDouble(input.split("\\s+")[2]);

            Topping topping;

            try {
                topping = new Topping(toppingType, toppingWeight);
            } catch (IllegalArgumentException e) {
                System.out.println(e.getMessage());
                return;
            }

            if (pizza != null) {
                pizza.addTopping(topping);
            }

            input = scanner.nextLine();
        }

        if (pizza != null) {
            System.out.printf("%s - %.2f%n", pizza.getName(), pizza.getOverallCalories());
        }
    }

}
