package edu.alenasoft.gildedrose;

public class Conjure implements QualityItem{
    @Override
    public void updateQuality(Item item) {
        if (item.getQuality() > 0) {
            item.setQuality(item.getQuality() - 2);
            if (item.getSellIn() < 0 && item.getQuality() > 0) {
                item.setQuality(item.getQuality() - 2);
            }
        }

        if (item.getQuality() < 0) item.setQuality(0);
    }
}
