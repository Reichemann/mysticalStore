package app.model.item.armor;

import app.model.item.Item;

public class Leggings implements Item {

    private static final String NAME = "Steel Leggings";

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