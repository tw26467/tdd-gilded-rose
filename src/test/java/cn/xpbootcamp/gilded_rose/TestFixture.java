package cn.xpbootcamp.gilded_rose;

public class TestFixture {
    public static void main(String[] args) {
        Commodity[] commodities = new Commodity[] {
                new Commodity("Aged Brie", 2, 0),
                new Commodity("Sulfuras", 0, 80),
                new Commodity("Backstage pass", 15, 20),
                new Commodity("Conjured Mana Cake", 3, 6) };

        GildedRose app = new GildedRose(commodities);

        int days = 2;
        if (args.length > 0) {
            days = Integer.parseInt(args[0]) + 1;
        }

        for (int i = 0; i < days; i++) {
            System.out.println("day:" + i);
            System.out.println("name, sellIn, quality");
            for (Commodity commodity : commodities) {
                System.out.println(commodity);
            }
            System.out.println();
            app.UpdateQuality();
        }
    }

}