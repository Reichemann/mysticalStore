package Items.alchemyStore;

import Items.Item;

public class powerPotion extends Item {

    private int price = 35;
    private String name = "Power Potion";

    @Override
    public int getPrice() {
        return this.price;
    }

    @Override
    public String getName() {
        return this.name;
    }
}