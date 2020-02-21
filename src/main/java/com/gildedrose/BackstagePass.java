package com.gildedrose;

public class BackstagePass implements MyItem {
    Item item;

    public BackstagePass(Item item){
        this.item=item;
    }

    public void updateQuality(){
        decreaseSellIn();

            updateQualityIncreaseWithAge();

            if (item.sellIn < 11 ) {updateQualityIncreaseWithAge();}
            if (item.sellIn < 6 ) {updateQualityIncreaseWithAge();}
            if (item.sellIn < 0 ) {setQualityZero();}

    }

    private void decreaseSellIn() {
        item.sellIn = item.sellIn - 1;
    }

    private void updateQualityIncreaseWithAge() {
        if(item.quality<50) {
            item.quality = item.quality + 1;
        }
    }

    private void setQualityZero() {
        item.quality = 0;
    }
}
