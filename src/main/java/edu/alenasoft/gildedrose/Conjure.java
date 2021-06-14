package edu.alenasoft.gildedrose;

public class Conjure implements QualityItem{
    @Override
    public void updateQuality(Item item) {
        if (item.getQuality() > 0) {
            item.setQuality(item.getQuality() - 1);
            if (item.getSellIn() < 0 && item.getQuality() > 0) {
                item.setQuality(item.getQuality() - 1);
            }
        }
        if (item.getQuality() > 0) {
            item.setQuality(item.getQuality() - 1);
            if (item.getSellIn() < 0 && item.getQuality() > 0) {
                item.setQuality(item.getQuality() - 1);
            }
        }
    }
}
