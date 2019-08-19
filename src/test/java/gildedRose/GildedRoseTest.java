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



}
