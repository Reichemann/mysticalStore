package app.model.item.weapon;

import app.model.item.Item;

public class Crossbow implements Item {

    private static final String NAME = "Powerful Crossbow";

    private static final int PRICE = 105;

    @Override
    public String getName() {
        return NAME;
    }

    @Override
    public int getPrice() {
        return PRICE;
    }
}