package gildedRose;

public class Item {

    public String name;

    public int sellIn;

    public int quality;

    public final static int BASE_QUALITY = 50;

    public Item(String name, int sellIn, int quality) {
        this.name = name;
        this.sellIn = sellIn;
        this.quality = quality;
    }

    protected void updateQualityLessBaseQuality() {
        if (quality < BASE_QUALITY) {
            quality ++;
        }
    }

   @Override
   public String toString() {
        return this.name + ", " + this.sellIn + ", " + this.quality;
    }
}
