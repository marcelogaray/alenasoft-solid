package edu.alenasoft.gildedrose;

public class AgedBrie implements QualityItem {
    @Override
    public void updateQuality(Item item) {
        if (item.getQuality() < 50) {
            item.setQuality(item.getQuality() + 1);
            if (item.getSellIn() < 0 && item.getQuality() < 50) {
                item.setQuality(item.getQuality() + 1);
            }
        }
    }
}
