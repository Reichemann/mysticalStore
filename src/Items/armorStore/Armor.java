package Items.armorStore;

import Items.Item;

public class Armor extends Item {

    private int price = 95;
    private String name = "Steel Armor";

    @Override
    public int getPrice() {
        return this.price;
    }

    @Override
    public String getName() {
        return this.name;
    }
}
