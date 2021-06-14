package edu.alenasoft.gildedrose;

import java.util.ArrayList;
import java.util.List;

public class GildedRose {

    public static List<Item> items = new ArrayList<>();

    public static void updateQuality() {
        for (Item item : items) {
            decreaseSellIn(item);
            doUpdateQuality(item);
        }
    }

    private static void doUpdateQuality(Item item) {
        QualityItem qualityItem = QualityItemFactory.getInstance().createQualityItem(item.name);
        qualityItem.updateQuality(item);
    }

    private static void decreaseSellIn(Item item) {
        if (!"Sulfuras, Hand of Ragnaros".equals(item.getName())) {
            item.setSellIn(item.getSellIn() - 1);
        }
    }
}
