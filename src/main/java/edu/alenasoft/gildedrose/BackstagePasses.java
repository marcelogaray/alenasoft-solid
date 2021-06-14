package edu.alenasoft.gildedrose;

public class BackstagePasses  implements QualityItem{
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

    /*public static void updateQuality() {
        for (int i = 0; i < items.size(); i++) {

            } else {
                if (items.get(i).getQuality() < 50) {
                    items.get(i).setQuality(items.get(i).getQuality() + 1);

                    if ("Backstage passes to a TAFKAL80ETC concert".equals(items.get(i).getName())) {
                        if (items.get(i).getSellIn() < 11) {  ASK
                            if (items.get(i).getQuality() < 50) { XXXXXX already asked
                                items.get(i).setQuality(items.get(i).getQuality() + 1);
                            }
                        }

                        if (items.get(i).getSellIn() < 6) {XXXXXX
                            if (items.get(i).getQuality() < 50) { XXXXXX already asked
                                items.get(i).setQuality(items.get(i).getQuality() + 1);
                            }
                        }
                    }
                }
            }

            if (items.get(i).getSellIn() < 0) {  ASK
                if (!"Aged Brie".equals(items.get(i).getName())) {
                    if (!"Backstage passes to a TAFKAL80ETC concert".equals(items.get(i).getName())) {
                        if (items.get(i).getQuality() > 0) {
                            if (!"Sulfuras, Hand of Ragnaros".equals(items.get(i).getName())) {
                                items.get(i).setQuality(items.get(i).getQuality() - 1);
                            }
                        }
                    } else {
                        items.get(i).setQuality(items.get(i).getQuality() - items.get(i).getQuality());
                    }
                } else {
                    if (items.get(i).getQuality() < 50) { XXXXXX already asked
                        items.get(i).setQuality(items.get(i).getQuality() + 1);
                    }
                }
            }
        }
    }*/
}
