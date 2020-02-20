package com.gildedrose;

class GildedRose {
    Item[] items;

    public GildedRose(Item[] items) {
        this.items = items;
    }

    public void updateQuality() {
        for (Item item : items) {
            if (!item.name.equals("Aged Brie")
                    && !item.name.equals("Backstage passes to a TAFKAL80ETC concert")) {
                if (isQualityPositive(item)) {
                    updateQualityDecreaseWithAge(item);
                }
            } else {
                updateQualityIncreaseWithAge(item);
                if (item.quality < 50) {

                    if (item.name.equals("Backstage passes to a TAFKAL80ETC concert")) {
                        if (item.sellIn < 11) {
                            updateQualityIncreaseWithAge(item);
                        }

                        if (item.sellIn < 6) {
                            updateQualityIncreaseWithAge(item);
                        }
                    }
                }

            }

            if (!item.name.equals("Sulfuras, Hand of Ragnaros")) {
                item.sellIn = item.sellIn - 1;
            }

            if (item.sellIn < 0) {
                if (!item.name.equals("Aged Brie")) {
                    if (!item.name.equals("Backstage passes to a TAFKAL80ETC concert")) {
                        if (isQualityPositive(item)) {
                            updateQualityDecreaseWithAge(item);
                        }
                    } else {
                        item.quality = item.quality - item.quality;
                    }
                } else {
                    updateQualityIncreaseWithAge(item);
                }
            }
        }
    }

    private boolean isQualityPositive(Item item) {
        return item.quality > 0;
    }

    private void updateQualityDecreaseWithAge(Item item) {
        if (!item.name.equals("Sulfuras, Hand of Ragnaros")) {
            item.quality = item.quality - 1;
        }
    }

    private void updateQualityIncreaseWithAge(Item item) {
        if (item.quality < 50) {
            item.quality = item.quality + 1;
        }
    }
}