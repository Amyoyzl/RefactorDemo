package gildedRose;
public class GildedRose {
    Item[] items;

    private final static int BASE_QUALITY = 50;

    public GildedRose(Item[] items) {
        this.items = items;
    }

    public void updateQuality() {
        for (int i = 0; i < items.length; i++) {
            if (isNotAgedBrieAndNotBackstage(items[i])) {
                updateQualityExceptSulfuras(items[i]);
            } else {
                if (items[i].quality < BASE_QUALITY) {
                    items[i].quality = items[i].quality + 1;

                    if (items[i].name.equals("Backstage passes to a TAFKAL80ETC concert")) {
                        if (items[i].sellIn < 11) {
                            updateQualityLessBaseQuality(items[i]);
                        }

                        if (items[i].sellIn < 6) {
                            updateQualityLessBaseQuality(items[i]);
                        }
                    }
                }
            }

            if (!items[i].name.equals("Sulfuras, Hand of Ragnaros")) {
                items[i].sellIn = items[i].sellIn - 1;
            }

            if (items[i].sellIn < 0) {
                if (!items[i].name.equals("Aged Brie")) {
                    if (!items[i].name.equals("Backstage passes to a TAFKAL80ETC concert")) {
                        updateQualityExceptSulfuras(items[i]);
                    } else {
                        items[i].quality = items[i].quality - items[i].quality;
                    }
                } else {
                    updateQualityLessBaseQuality(items[i]);
                }
            }
        }
    }

    private void updateQualityLessBaseQuality(Item item) {
        if (item.quality < BASE_QUALITY) {
            item.quality = item.quality + 1;
        }
    }

    private void updateQualityExceptSulfuras(Item item) {
        if (item.quality > 0 && !item.name.equals("Sulfuras, Hand of Ragnaros")) {
            item.quality = item.quality - 1;
        }
    }

    private boolean isNotAgedBrieAndNotBackstage(Item item) {
        return !item.name.equals("Aged Brie")
                && !item.name.equals("Backstage passes to a TAFKAL80ETC concert");
    }
}