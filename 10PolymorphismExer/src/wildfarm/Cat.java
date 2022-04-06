package wildfarm;

import java.text.DecimalFormat;

public class Cat extends Felime {

    private String breed;

    public Cat(String animalName, String animalType, double animalWeight, String livingRegion,
            String breed) {
        super(animalName, animalType, animalWeight, livingRegion);
        this.breed = breed;
    }

    @Override
    public void makeSound() {
        System.out.println("Meowwww");
    }

    @Override
    public String toString() {
        DecimalFormat formatter = new DecimalFormat("##.##");
        return String.format("%s[%s, %s, %s, %s, %d]", getAnimalName(), getAnimalType(), this.breed,
                formatter.format(getAnimalWeight()), getLivingRegion(), getFoodEaten());
    }
}
