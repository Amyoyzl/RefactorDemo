package gildedRose;
public class GildedRose {
    Item[] items;

    private Strategy strategy;

    public GildedRose(Item[] items, Strategy strategy) {
        this.items = items;
        this.strategy = strategy;
    }

    public void updateQuality() {
        for (int i = 0; i < items.length; i++) {
            strategy.updateQuality(items[i]);
        }
    }

}