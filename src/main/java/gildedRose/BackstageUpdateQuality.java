package gildedRose;

public class BackstageUpdateQuality implements Strategy {
    @Override
    public void updateQuality(Item item) {
        item.updateQualityLessBaseQuality();
        if (item.sellIn < 11) {
            item.updateQualityLessBaseQuality();
        }
        if (item.sellIn < 6) {
            item.updateQualityLessBaseQuality();
        }
        item.sellIn --;
        if(item.sellIn < 0) {
            item.quality = 0;
        }
    }
}
