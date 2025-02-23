package gildedRose;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class GildedRoseTest {

    @Test
    public void should_update_gildedRose_items_when_updateQuality_given_item_name_Aged_Brie_and_sellIn_2() {
        Item[] items = new Item[]{new Item("Aged Brie",
                2, 3, new AgedBrieUpdateQuality())};
        GildedRose gildedRose = new GildedRose(items);
        Item updateItem =  new Item("Aged Brie",
                1, 4, new AgedBrieUpdateQuality());

        gildedRose.updateQuality();

        assertEquals(updateItem.toString(), items[0].toString());
    }

    @Test
    public void should_update_gildedRose_items_when_updateQuality_given_item_name_Aged_Brie_and_sellIn_less_than_zero_and_quality_50() {
        Item[] items = new Item[]{new Item("Aged Brie",
                -2, 50, new AgedBrieUpdateQuality())};
        GildedRose gildedRose = new GildedRose(items);
        Item updateItem =  new Item("Aged Brie",
                -3, 50, new AgedBrieUpdateQuality());

        gildedRose.updateQuality();

        assertEquals(updateItem.toString(), items[0].toString());
    }

    @Test
    public void should_update_gildedRose_items_when_updateQuality_given_item_name_Aged_Brie_and_sellIn_less_than_zero_and_quality_3() {
        Item[] items = new Item[]{new Item("Aged Brie",
                -2, 3, new AgedBrieUpdateQuality())};
        GildedRose gildedRose = new GildedRose(items);
        Item updateItem =  new Item("Aged Brie",
                -3, 5, new AgedBrieUpdateQuality());

        gildedRose.updateQuality();

        assertEquals(updateItem.toString(), items[0].toString());
    }

    @Test
    public void should_update_gildedRose_items_when_updateQuality_given_item_name_Backstage_and_sellIn_less_than_zero_and_quality_3() {
        Item item = new Item("Backstage passes to a TAFKAL80ETC concert",
                -2, 3, new BackstageUpdateQuality());
        Item[] items = new Item[]{item};
        GildedRose gildedRose = new GildedRose(items);
        Item updateItem =  new Item("Backstage passes to a TAFKAL80ETC concert",
                -3, 0, new BackstageUpdateQuality());

        gildedRose.updateQuality();

        assertEquals(updateItem.toString(), items[0].toString());
    }

    @Test
    public void should_update_gildedRose_items_when_updateQuality_given_item_name_Backstage_and_sellIn_2_and_quality_3() {
        Item[] items = new Item[]{new Item("Backstage passes to a TAFKAL80ETC concert",
                2, 3, new BackstageUpdateQuality())};
        GildedRose gildedRose = new GildedRose(items);
        Item updateItem =  new Item("Backstage passes to a TAFKAL80ETC concert",
                1, 6, new BackstageUpdateQuality());

        gildedRose.updateQuality();

        assertEquals(updateItem.toString(), items[0].toString());
    }

    @Test
    public void should_update_gildedRose_items_when_updateQuality_given_item_name_Backstage_and_sellIn_8_and_quality_3() {
        Item[] items = new Item[]{new Item("Backstage passes to a TAFKAL80ETC concert",
                8, 3, new BackstageUpdateQuality())};
        GildedRose gildedRose = new GildedRose(items);
        Item updateItem =  new Item("Backstage passes to a TAFKAL80ETC concert",
                7, 5, new BackstageUpdateQuality());

        gildedRose.updateQuality();

        assertEquals(updateItem.toString(), items[0].toString());
    }

    @Test
    public void should_update_gildedRose_items_when_updateQuality_given_item_name_Sulfuras_and_sellIn_8_and_quality_3() {
        Item[] items = new Item[]{new Item("Sulfuras, Hand of Ragnaros",
                8, 3, new SulfurasUpadateQuality())};
        GildedRose gildedRose = new GildedRose(items);
        Item updateItem =  new Item("Sulfuras, Hand of Ragnaros",
                8, 3, new SulfurasUpadateQuality());

        gildedRose.updateQuality();

        assertEquals(updateItem.toString(), items[0].toString());
    }

    @Test
    public void should_update_gildedRose_items_when_updateQuality_given_item_name_others_and_sellIn_0_and_quality_3() {
        Item[] items = new Item[]{new Item("others",0, 3, new OtherUpdateQuality())};
        GildedRose gildedRose = new GildedRose(items);
        Item updateItem =  new Item("others", -1, 1, new OtherUpdateQuality());

        gildedRose.updateQuality();

        assertEquals(updateItem.toString(), items[0].toString());
    }

    @Test
    public void should_update_gildedRose_items_when_updateQuality_given_item_name_Backstage_and_sellIn_5_and_quality_47() {
        Item[] items = new Item[]{new Item("Backstage passes to a TAFKAL80ETC concert",
                5, 47, new BackstageUpdateQuality())};
        GildedRose gildedRose = new GildedRose(items);
        Item updateItem =  new Item("Backstage passes to a TAFKAL80ETC concert",
                4, 50, new BackstageUpdateQuality());

        gildedRose.updateQuality();

        assertEquals(updateItem.toString(), items[0].toString());
    }

    @Test
    public void should_update_gildedRose_items_when_updateQuality_given_item_name_Backstage_and_sellIn_5_and_quality_48() {
        Item[] items = new Item[]{new Item("Backstage passes to a TAFKAL80ETC concert",
                5, 48, new BackstageUpdateQuality())};
        GildedRose gildedRose = new GildedRose(items);
        Item updateItem =  new Item("Backstage passes to a TAFKAL80ETC concert",
                4, 50, new BackstageUpdateQuality());

        gildedRose.updateQuality();

        assertEquals(updateItem.toString(), items[0].toString());
    }

}
