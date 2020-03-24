package cn.xpbootcamp.gilded_rose;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class GildedRoseTest {

    @Test
    void foo() {
        Commodity[] commodities = new Commodity[] { new Commodity("foo", 0, 0) };
        GildedRose app = new GildedRose(commodities);
        app.UpdateQuality();
        assertEquals("foo", app.commodities[0].name);
    }

    @Test
    void aged_brie() {
        Commodity[] commodities = new Commodity[] { new Commodity("Aged Brie", 2, 0) };
        GildedRose app = new GildedRose(commodities);
        app.UpdateQuality();
        assertEquals(2, app.commodities[0].sellIn);
    }

    @Test
    void sulfuras() {
        Commodity[] commodities = new Commodity[] { new Commodity("Sulfuras", 2, 0) };
        GildedRose app = new GildedRose(commodities);
        app.UpdateQuality();
        assertEquals(2, app.commodities[0].sellIn);
    }

    @Test
    void backstage_pass() {
        Commodity[] commodities = new Commodity[] { new Commodity("Backstage pass", 2, 0) };
        GildedRose app = new GildedRose(commodities);
        app.UpdateQuality();
        assertEquals(2, app.commodities[0].sellIn);
    }
}
