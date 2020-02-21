package com.gildedrose;

public class BackstagePass extends AbstractMyItem {
    Item item;

    public BackstagePass(Item item){
        this.item=item;
    }

    public void updateQuality(){
        decreaseSellIn(item);

            updateQualityIncreaseWithAge(item);

            if (item.sellIn < 11 ) {updateQualityIncreaseWithAge(item);}
            if (item.sellIn < 6 ) {updateQualityIncreaseWithAge(item);}
            if (item.sellIn < 0 ) {setQualityZero(item);}

    }


}
