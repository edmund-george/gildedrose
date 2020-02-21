package com.gildedrose;

class GildedRose {
    Item[] items;

    public GildedRose(Item[] items) {
        this.items = items;
    }

    public void updateQuality() {
        for (Item item : items) {
            if(isNormalItem(item)){
               new NormalItem(item).updateQuality();
            }
            else updateQuality(item);
        }
    }

    private void updateQuality(Item item) {


            if(isAgedBrie(item)){
                decreaseSellIn(item);
                updateQualityIncreaseWithAge(item);
                if (item.sellIn < 0 && item.quality<50) updateQualityIncreaseWithAge(item);
            }
            if (isBackstagePass(item)) {
                decreaseSellIn(item);

                    if(item.quality<50) updateQualityIncreaseWithAge(item);
                    if (item.sellIn < 11 && item.quality<50) {updateQualityIncreaseWithAge(item);}
                    if (item.sellIn < 6 && item.quality<50) {updateQualityIncreaseWithAge(item);}
                    if (item.sellIn < 0 && item.quality<50) setQualityZero(item);

            }

        }


    private void decreaseSellIn(Item item) {
        item.sellIn = item.sellIn - 1;
    }

    private void setQualityZero(Item item) {
        item.quality = 0;
    }

    private boolean isNormalItem(Item item){
        return !isAgedBrie(item) && !isBackstagePass(item) && !isSulfuras(item);
    }

    private boolean isAgedBrie(Item item) {
        return item.name.equals("Aged Brie");
    }

    private boolean isSulfuras(Item item) {
        return item.name.equals("Sulfuras, Hand of Ragnaros");
    }

    private boolean isBackstagePass(Item item) {
        return item.name.equals("Backstage passes to a TAFKAL80ETC concert");
    }

    private boolean isQualityPositive(Item item) {
        return item.quality > 0;
    }

    private void updateQualityDecreaseWithAge(Item item) {
        if (!isSulfuras(item)) {
            item.quality = item.quality - 1;
        }
    }

    private void updateQualityIncreaseWithAge(Item item) {
            item.quality = item.quality + 1;
    }
}