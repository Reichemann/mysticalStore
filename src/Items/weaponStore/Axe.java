package Items.weaponStore;

import Items.Item;

public class Axe extends Item {

    private int price = 70;
    private String name = "Mithril Axe";

    @Override
    public int getPrice() {
        return this.price;
    }

    @Override
    public String getName() {
        return this.name;
    }
}