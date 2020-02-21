package com.gildedrose;

public abstract class AbstractMyItem implements MyItem {

    void decreaseSellIn(Item item) {
        item.sellIn = item.sellIn - 1;
    }

    void updateQualityIncreaseWithAge(Item item) {
        if (item.quality < 50) {
            item.quality = item.quality + 1;
        }
    }

    void setQualityZero(Item item) {
        item.quality = 0;
    }


    boolean isQualityPositive(Item item) {
        return item.quality > 0;
    }

    void updateQualityDecreaseWithAge(Item item) {
        item.quality = item.quality - 1;
    }


}

