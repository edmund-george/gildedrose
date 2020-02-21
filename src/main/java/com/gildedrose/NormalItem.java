package com.gildedrose;

public class NormalItem {
    Item item;

    public NormalItem(Item item){
        this.item=item;
    }

    public void updateQuality(){
        decreaseSellIn(item);
        if (isQualityPositive(item)) updateQualityDecreaseWithAge(item);
        if (item.sellIn < 0) { if (isQualityPositive(item)) updateQualityDecreaseWithAge(item);}
    }

    private void decreaseSellIn(Item item) {
        item.sellIn = item.sellIn - 1;
    }

    private boolean isQualityPositive(Item item) {
        return item.quality > 0;
    }

    private void updateQualityDecreaseWithAge(Item item) {
            item.quality = item.quality - 1;
    }

}
