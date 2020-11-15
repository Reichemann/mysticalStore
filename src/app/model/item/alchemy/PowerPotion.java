package app.model.item.alchemy;

import app.model.item.Item;

public class PowerPotion implements Item {

    private static final String NAME = "Power Potion";

    private static final int PRICE = 35;

    @Override
    public String getName() {
        return NAME;
    }

    @Override
    public int getPrice() {
        return PRICE;
    }
}