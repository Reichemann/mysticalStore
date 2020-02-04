package Items.alchemyStore;

import Items.Item;

public class healthPotion extends Item {

    private int price = 25;
    private String name = "Health Potion";

    @Override
    public int getPrice() {
        return this.price;
    }

    @Override
    public String getName() {
        return this.name;
    }
}