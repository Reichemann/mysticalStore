package app.model.item.weapon;

import app.model.item.Item;

public class Sword implements Item {

    private static final String NAME = "Steel Sword";

    private static final int PRICE = 65;

    @Override
    public String getName() {
        return NAME;
    }

    @Override
    public int getPrice() {
        return PRICE;
    }
}