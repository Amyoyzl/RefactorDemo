package gildedRose;

public class OtherUpdateQuality implements Strategy{
    @Override
    public void updateQuality(Item item) {
        if (item.quality > 0) item.quality --;
        item.sellIn --;
        if(item.sellIn < 0){
            if (item.quality > 0) item.quality --;
        }
    }
}
