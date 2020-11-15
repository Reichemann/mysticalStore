package app.model.item.magic;

import app.model.item.Item;

public class Staff implements Item {

    private static final String NAME = "Arcane Staff";

    private static final int PRICE = 120;

    @Override
    public String getName() {
        return NAME;
    }

    @Override
    public int getPrice() {
        return PRICE;
    }
}