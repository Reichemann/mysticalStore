package Items.alchemyStore;

import Items.Item;

public class ManaPotion extends Item {

    private int price = 25;
    private String name = "Mana Potion";

    @Override
    public int getPrice() {
        return this.price;
    }

    @Override
    public String getName() {
        return this.name;
    }
}