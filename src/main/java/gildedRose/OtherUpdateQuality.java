package gildedRose;

public class OtherUpdateQuality implements Strategy{
    @Override
    public void updateQuality(Item item) {
        item.decreaseQualityIfQualityGrantZero();
        item.sellIn --;
        if(item.sellIn < 0){
            item.decreaseQualityIfQualityGrantZero();
        }
    }
}
