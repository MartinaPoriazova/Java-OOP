package pizza;

public class Dough {

    private String flourType;
    private String bakingTechnique;
    private double weight;


    public Dough(String flourType, String bakingTechnique, double weight) {
        this.setFlourType(flourType);
        this.setBakingTechnique(bakingTechnique);
        this.setWeight(weight);
    }

    private void setFlourType(String flourType) {
        if (flourType.equals("White") || flourType.equals("Wholegrain")) {
            this.flourType = flourType;
        } else {
            throw new IllegalArgumentException("Invalid type of dough.");
        }
    }

    private void setBakingTechnique(String bakingTechnique) {
        if (bakingTechnique.equals("Crispy") || bakingTechnique.equals("Chewy") ||
                bakingTechnique.equals("Homemade")) {
            this.bakingTechnique = bakingTechnique;
        } else {
            throw new IllegalArgumentException("Invalid type of dough.");
        }
    }

    private void setWeight(double weight) {
        if (weight >= 1 && weight <= 200) {
            this.weight = weight;
        } else {
            throw new IllegalArgumentException("Dough weight should be in the range [1..200].");
        }
    }

    public double calculateCalories() {
        int base = 2;
        double modifierFlourType = 0.0;
        double modifierBakingTechnique = 0.0;
        if (this.flourType.equals("White")) {
            modifierFlourType = 1.5;
        }
        if (this.flourType.equals("Wholegrain")) {
            modifierFlourType = 1.0;
        }
        if (this.bakingTechnique.equals("Crispy")) {
            modifierBakingTechnique = 0.9;
        }
        if (this.bakingTechnique.equals("Chewy")) {
            modifierBakingTechnique = 1.1;
        }
        if (this.bakingTechnique.equals("Homemade")) {
            modifierBakingTechnique = 1.0;
        }
        return (base * weight) * modifierFlourType * modifierBakingTechnique;
    }
}
