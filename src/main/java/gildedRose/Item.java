package gildedRose;

public class Item {

    public String name;

    public int sellIn;

    public int quality;

    private Strategy strategy;

    public final static int BASE_QUALITY = 50;

    public Item(String name, int sellIn, int quality, Strategy strategy) {
        this.name = name;
        this.sellIn = sellIn;
        this.quality = quality;
        this.strategy = strategy;
    }

    protected void updateQualityLessBaseQuality() {
        if (quality < BASE_QUALITY) {
            quality ++;
        }
    }

    public void updateQuality() {
        strategy.updateQuality(this);
    }

   @Override
   public String toString() {
        return this.name + ", " + this.sellIn + ", " + this.quality;
    }

}
