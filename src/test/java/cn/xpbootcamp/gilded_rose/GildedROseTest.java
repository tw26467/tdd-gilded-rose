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

}
