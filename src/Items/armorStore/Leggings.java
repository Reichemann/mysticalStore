package Items.armorStore;

import Items.Item;

public class Leggings extends Item {

    private int price = 35;
    private String name = "Steel Leggings";

    @Override
    public int getPrice() {
        return this.price;
    }

    @Override
    public String getName() {
        return this.name;
    }
}
