package catHouse.entities.cat;

public class LonghairCat extends BaseCat {

    private static final int initial_kilograms = 9;

    public LonghairCat(String name, String breed, double price) {
        super(name, breed, price);
        setKilograms(initial_kilograms);
    }

    @Override
    public void eating() {
        int newSize = getKilograms() + initial_kilograms;
        setKilograms(newSize);
    }
}
