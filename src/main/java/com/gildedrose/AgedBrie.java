package com.gildedrose;

public class AgedBrie {
    Item item;

    public AgedBrie(Item item){
        this.item=item;
    }

    public void updateQuality(){
        decreaseSellIn(item);
        updateQualityIncreaseWithAge(item);
        if (item.sellIn < 0 && item.quality<50) updateQualityIncreaseWithAge(item);
    }

    private void decreaseSellIn(Item item) {
        item.sellIn = item.sellIn - 1;
    }

    private void updateQualityIncreaseWithAge(Item item) {
        item.quality = item.quality + 1;
    }
}
