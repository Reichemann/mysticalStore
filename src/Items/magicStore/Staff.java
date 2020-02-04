package Items.magicStore;

import Items.Item;

public class Staff extends Item {

    private int price = 120;
    private String name = "Arcane Staff";

    @Override
    public int getPrice() {
        return this.price;
    }

    @Override
    public String getName() {
        return this.name;
    }
}
