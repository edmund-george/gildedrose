package com.gildedrose;
import static com.gildedrose.MyItem.myItem;

class GildedRose {

    public static final String BRIE = "Aged Brie";
    public static final String SULFURAS = "Sulfuras, Hand of Ragnaros";
    public static final String BACKSTAGE_PASS = "Backstage passes to a TAFKAL80ETC concert";



    Item[] items;

    public GildedRose(Item[] items) {
        this.items = items;
    }

    public void updateQuality() {
        for (Item item : items) {
             myItem(item).updateQuality();
        }
    }



}