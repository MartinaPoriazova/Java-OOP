package greedyTimes;

public class Bag {

    private Gold gold;
    private CashContainer cashContainer;
    private GemContainer gemContainer;

    private long capacity;

    public Bag(long capacity) {
        this.cashContainer = new CashContainer();
        this.gold = new Gold();
        this.gemContainer = new GemContainer();
        this.capacity = capacity;
    }

    public boolean hasRoomFor(Long value) {
        return value + this.currentSize() <= capacity;
    }

    private Long currentSize() {
        long size = this.gold.getValue();
        size += this.cashContainer.getValue();
        size += this.gemContainer.getValue();
        return size;
    }

    public void addGold(long value) {
        this.gold.increaseValue(value);
    }

    public void addCash(long value) {
        if (this.gold.getValue() >= this.cashContainer.getValue() + value) {

        }
    }

}
