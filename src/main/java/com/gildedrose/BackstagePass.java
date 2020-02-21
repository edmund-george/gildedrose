package com.gildedrose;

public class BackstagePass {
    Item item;

    public BackstagePass(Item item){
        this.item=item;
    }

    public void updateQuality(){
        decreaseSellIn(item);
        if(item.quality<50) updateQualityIncreaseWithAge(item);
        if (item.sellIn < 11 && item.quality<50) {updateQualityIncreaseWithAge(item);}
        if (item.sellIn < 6 && item.quality<50) {updateQualityIncreaseWithAge(item);}
        if (item.sellIn < 0 && item.quality<50) setQualityZero(item);
    }

    private void decreaseSellIn(Item item) {
        item.sellIn = item.sellIn - 1;
    }

    private void updateQualityIncreaseWithAge(Item item) {
        item.quality = item.quality + 1;
    }

    private void setQualityZero(Item item) {
        item.quality = 0;
    }
}
