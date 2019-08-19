package gildedRose;

public class AgedBrieUpdateQuality implements Strategy {
    @Override
    public void updateQuality(Item item) {
        item.updateQualityLessBaseQuality();
        item.sellIn --;
        if(item.sellIn < 0) {
            item.updateQualityLessBaseQuality();
        }
    }

}
