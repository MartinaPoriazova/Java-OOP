package catHouse.entities.cat;

public class ShorthairCat extends BaseCat {

    private static final int initial_kilograms = 7;

    public ShorthairCat(String name, String breed, double price) {
        super(name, breed, price);
    }

    @Override
    public void eating() {
        int newSize = getKilograms() + 2;
        setKilograms(newSize);
    }
}
