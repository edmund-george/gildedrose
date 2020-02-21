package com.gildedrose;

public class NormalItem extends AbstractMyItem{
    Item item;

    public NormalItem(Item item){
        this.item=item;
    }

    public void updateQuality(){
        decreaseSellIn(item);
        if (isQualityPositive(item)) updateQualityDecreaseWithAge(item);
        if (item.sellIn < 0) { if (isQualityPositive(item)) updateQualityDecreaseWithAge(item);}
    }



}
