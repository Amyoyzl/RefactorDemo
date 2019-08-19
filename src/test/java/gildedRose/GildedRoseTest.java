package gildedRose;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class GildedRoseTest {

    @Test
    public void should_update_gildedRose_items_when_updateQuality_given_item_name_Aged_Brie_and_sellIn_2() {
        Item[] items = new Item[]{new Item("Aged Brie", 2, 3)};
        GildedRose gildedRose = new GildedRose(items);
        Item updateItem =  new Item("Aged Brie", 1, 4);

        gildedRose.updateQuality();

        assertEquals(updateItem.toString(), items[0].toString());
    }

    @Test
    public void should_update_gildedRose_items_when_updateQuality_given_item_name_Aged_Brie_and_sellIn_less_than_zero_and_quality_50() {
        Item[] items = new Item[]{new Item("Aged Brie", -2, 50)};
        GildedRose gildedRose = new GildedRose(items);
        Item updateItem =  new Item("Aged Brie", -3, 50);

        gildedRose.updateQuality();

        assertEquals(updateItem.toString(), items[0].toString());
    }

    @Test
    public void should_update_gildedRose_items_when_updateQuality_given_item_name_Aged_Brie_and_sellIn_less_than_zero_and_quality_3() {
        Item[] items = new Item[]{new Item("Aged Brie", -2, 3)};
        GildedRose gildedRose = new GildedRose(items);
        Item updateItem =  new Item("Aged Brie", -3, 5);

        gildedRose.updateQuality();

        assertEquals(updateItem.toString(), items[0].toString());
    }

    @Test
    public void should_update_gildedRose_items_when_updateQuality_given_item_name_Backstage_and_sellIn_less_than_zero_and_quality_3() {
        Item[] items = new Item[]{new Item("Backstage passes to a TAFKAL80ETC concert", -2, 3)};
        GildedRose gildedRose = new GildedRose(items);
        Item updateItem =  new Item("Backstage passes to a TAFKAL80ETC concert", -3, 0);

        gildedRose.updateQuality();

        assertEquals(updateItem.toString(), items[0].toString());
    }

}
