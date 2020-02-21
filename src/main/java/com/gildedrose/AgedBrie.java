package com.gildedrose;

public class AgedBrie extends AbstractMyItem{
    Item item;

    public AgedBrie(Item item){
        this.item=item;
    }

    public void updateQuality(){
        decreaseSellIn(item);
        updateQualityIncreaseWithAge(item);
        if (item.sellIn < 0 && item.quality<50) updateQualityIncreaseWithAge(item);
    }


}
