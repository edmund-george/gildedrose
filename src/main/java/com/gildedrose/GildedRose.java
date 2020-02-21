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
            else if(isAgedBrie(item)){
                new AgedBrie(item).updateQuality();
            }
            else if(isBackstagePass(item)){
                new BackstagePass(item).updateQuality();
            }
        }
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

}