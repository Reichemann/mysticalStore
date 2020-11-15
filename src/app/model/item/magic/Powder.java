package app.model.item.magic;

import app.model.item.Item;

public class Powder implements Item {

    private static final String NAME = "Magic Powder";

    private static final int PRICE = 55;

    @Override
    public String getName() {
        return NAME;
    }

    @Override
    public int getPrice() {
        return PRICE;
    }
}