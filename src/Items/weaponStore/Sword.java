package Items.weaponStore;

import Items.Item;

public class Sword extends Item {

    private int price = 65;
    private String name = "Steel Sword";

    @Override
    public int getPrice() {
        return this.price;
    }

    @Override
    public String getName() {
        return this.name;
    }
}