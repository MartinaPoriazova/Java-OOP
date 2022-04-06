package cardsuit;

public class Main {

    public static void main(String[] args) {
        System.out.println("Card Suits: ");
        for (CardSuits cardsuits : CardSuits.values()) {
            System.out.printf("Ordinal value: %d; Name value: %s\n", cardsuits.ordinal(), cardsuits.name());
        }
    }

}
