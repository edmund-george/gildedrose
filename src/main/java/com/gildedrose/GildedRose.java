package com.gildedrose;

class GildedRose {
    Item[] items;

    public GildedRose(Item[] items) {
        this.items = items;
    }

    public void updateQuality() {
        for (Item item : items) {
            if (!item.name.equals("Aged Brie")
                    && !isBackstagePass(item)) {
                if (isQualityPositive(item)) {
                    updateQualityDecreaseWithAge(item);
                }
            } else {
                updateQualityIncreaseWithAge(item);
                if (item.quality < 50) {

                    if (isBackstagePass(item)) {
                        if (item.sellIn < 11) {
                            updateQualityIncreaseWithAge(item);
                        }

                        if (item.sellIn < 6) {
                            updateQualityIncreaseWithAge(item);
                        }
                    }
                }

            }

            if (!isSulfuras(item)) {
                item.sellIn = item.sellIn - 1;
            }

            if (item.sellIn < 0) {
                if (!item.name.equals("Aged Brie")) {
                    if (!isBackstagePass(item)) {
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
        if (item.quality < 50) {
            item.quality = item.quality + 1;
        }
    }
}