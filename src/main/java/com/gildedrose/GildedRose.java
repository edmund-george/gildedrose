package com.gildedrose;

class GildedRose {
    Item[] items;

    public GildedRose(Item[] items) {
        this.items = items;
    }

    public void updateQuality() {
        for (Item item : items) {
            moo(item).updateQuality();
        }
    }

    private MyItem moo(Item item) {
        if(isNormalItem(item)){
           return new NormalItem(item);
        }
        else if(isAgedBrie(item)){
            return new AgedBrie(item);
        }
        else if(isBackstagePass(item)){
            return new BackstagePass(item);
        }
        return new Sulfuras();
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