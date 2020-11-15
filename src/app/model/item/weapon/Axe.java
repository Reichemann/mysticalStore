package app.model.item.weapon;

import app.model.item.Item;

public class Axe implements Item {

    private static final String NAME = "Mithril Axe";

    private static final int PRICE = 70;

    @Override
    public String getName() {
        return NAME;
    }

    @Override
    public int getPrice() {
        return PRICE;
    }
}