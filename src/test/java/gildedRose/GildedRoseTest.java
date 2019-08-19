package gildedRose;

import org.junit.Test;

import static org.junit.Assert.assertSame;

public class GildedRoseTest {

    @Test
    public void should_update_gildedRose_items_when_updateQuality_given_item_name_Aged_Brie_and_sellIn_2() {
        Item[] items = new Item[]{new Item("Aged Brie", 2, 3)};
        GildedRose gildedRose = new GildedRose(items);

        gildedRose.updateQuality();

        assertSame(gildedRose.items, items);
    }

}
