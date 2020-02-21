package com.gildedrose;

public interface MyItem {


    static MyItem myItem(Item item){
        if(item.name==GildedRose.BRIE){
            return new AgedBrie(item);
        }
        else if(item.name==GildedRose.BACKSTAGE_PASS){
            return new BackstagePass(item);
        }
        else if(item.name==GildedRose.SULFURAS){
            return new Sulfuras();
        }
        return new NormalItem(item);


    };

    void updateQuality();

}
