package app.model.item.armor;

import app.model.item.Item;

public class Armor implements Item {

    private static final String NAME = "Steel Armor";

    private static final int PRICE = 95;

    @Override
    public String getName() {
        return NAME;
    }

    @Override
    public int getPrice() {
        return PRICE;
    }
}