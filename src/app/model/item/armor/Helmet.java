package app.model.item.armor;

import app.model.item.Item;

public class Helmet implements Item {

    private static final String NAME = "Steel Helmet";

    private static final int PRICE = 40;

    @Override
    public String getName() {
        return NAME;
    }

    @Override
    public int getPrice() {
        return PRICE;
    }
}