package edu.alenasoft.gildedrose;

import java.util.HashMap;
import java.util.Map;

public class QualityItemFactory {
    private static QualityItemFactory instance = new QualityItemFactory();

    private Map<String, QualityItem> qualyItemMap;

    private QualityItemFactory(){
        qualyItemMap = new HashMap<>();
        qualyItemMap.put("Aged Brie", new AgedBrie());
        qualyItemMap.put("+5 Dexterity Vest", new FiveDexterityVest());
        qualyItemMap.put("Sulfuras, Hand of Ragnaros", new SulfurasHandOfRagnaros());
        qualyItemMap.put("Backstage passes to a TAFKAL80ETC concert", new BackstagePasses());
        qualyItemMap.put("Conjured Mana Cake", new Conjure());
    }

    public static QualityItemFactory getInstance(){
        return instance;
    }

    public QualityItem createQualityItem(String ItemType){
        return qualyItemMap.get(ItemType);
    }
}
