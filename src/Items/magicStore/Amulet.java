package Items.magicStore;

import Items.Item;

public class Amulet extends Item {

    private int price = 55;
    private String name = "Mystical Amulet";

    @Override
    public int getPrice() {
        return this.price;
    }

    @Override
    public String getName() {
        return this.name;
    }
}