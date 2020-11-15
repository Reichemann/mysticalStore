package app.model.item.alchemy;

import app.model.item.Item;

public class ManaPotion implements Item {

    private static final String NAME = "Mana Potion";

    private static final int PRICE = 25;

    @Override
    public String getName() {
        return NAME;
    }

    @Override
    public int getPrice() {
        return PRICE;
    }
}