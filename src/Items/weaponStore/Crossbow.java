package Items.weaponStore;

import Items.Item;

public class Crossbow extends Item {

    private int price = 105;
    private String name = "Powerful Crossbow";

    @Override
    public int getPrice() {
        return this.price;
    }

    @Override
    public String getName() {
        return this.name;
    }
}