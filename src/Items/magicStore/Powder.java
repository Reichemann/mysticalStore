package Items.magicStore;

import Items.Item;

public class Powder extends Item {

    private int price = 55;
    private String name = "Magic Powder";

    @Override
    public int getPrice() {
        return this.price;
    }

    @Override
    public String getName() {
        return this.name;
    }
}