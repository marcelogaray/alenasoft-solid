package edu.alenasoft.gildedrose;

public class BackstagePasses implements QualityItem {
    @Override
    public void updateQuality(Item item) {
        if (item.getQuality() < 50) {
            item.setQuality(item.getQuality() + 1);
            if ((item.getSellIn() < 11)) {
                item.setQuality(item.getQuality() + 1);
            }
            if ((item.getSellIn() < 6)) {
                item.setQuality(item.getQuality() + 1);
            }
            if (item.getSellIn() < 0) {
                item.setQuality(0);
            }
        }
    }
}
