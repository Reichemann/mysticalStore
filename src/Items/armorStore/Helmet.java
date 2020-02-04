package Items.armorStore;

import Items.Item;

public class Helmet extends Item {

    private int price = 40;
    private String name = "Steel Helmet";

    

    @Override
    public String getName() {
        return this.name;
    }

    @Override
    public int getPrice() {
        return this.price;
    }
}
