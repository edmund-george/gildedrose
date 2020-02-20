package com.gildedrose;

class GildedRose {
    Item[] items;

    public GildedRose(Item[] items) {
        this.items = items;
    }

    public void updateQuality() {
        for (int i = 0; i < items.length; i++) {
            if (!items[i].name.equals("Aged Brie")
                    && !items[i].name.equals("Backstage passes to a TAFKAL80ETC concert")) {
                if (isQualityPositive(items[i])) {
                    updateQualityDecreaseWithAge(i);
                }
            } else {
                updateQualityIncreaseWithAge(i);
                if (items[i].quality < 50) {

                    if (items[i].name.equals("Backstage passes to a TAFKAL80ETC concert")) {
                        if (items[i].sellIn < 11) {
                            updateQualityIncreaseWithAge(i);
                        }

                        if (items[i].sellIn < 6) {
                            updateQualityIncreaseWithAge(i);
                        }
                    }
                }

            }

            if (!items[i].name.equals("Sulfuras, Hand of Ragnaros")) {
                items[i].sellIn = items[i].sellIn - 1;
            }

            if (items[i].sellIn < 0) {
                if (!items[i].name.equals("Aged Brie")) {
                    if (!items[i].name.equals("Backstage passes to a TAFKAL80ETC concert")) {
                        if (isQualityPositive(items[i])) {
                            updateQualityDecreaseWithAge(i);
                        }
                    } else {
                        items[i].quality = items[i].quality - items[i].quality;
                    }
                } else {
                    updateQualityIncreaseWithAge(i);
                }
            }
        }
    }

    private boolean isQualityPositive(Item item) {
        return item.quality > 0;
    }

    private void updateQualityDecreaseWithAge(int i) {
        if (!items[i].name.equals("Sulfuras, Hand of Ragnaros")) {
            items[i].quality = items[i].quality - 1;
        }
    }

    private void updateQualityIncreaseWithAge(int i) {
        if (items[i].quality < 50) {
            items[i].quality = items[i].quality + 1;
        }
    }
}