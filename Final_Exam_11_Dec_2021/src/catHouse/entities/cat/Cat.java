package catHouse.entities.cat;

public interface Cat {

    String name = null;

    String getName();

    void setName(String name);

    int getKilograms();

    double getPrice();

    void eating();
}
