package Stores;

import java.util.List;
import java.util.ArrayList;
import Items.Item;
import Items.alchemyStore.HealthPotion;
import Items.alchemyStore.ManaPotion;
import Items.alchemyStore.PowerPotion;

public class AlchemyStore extends Store {

    private HealthPotion someHealthPotion;
    private ManaPotion someManaPotion;
    private PowerPotion somePowerPotion;

    private List<Item> storeList = new ArrayList<>();

    public AlchemyStore() {
        someHealthPotion = new HealthPotion();
        someManaPotion = new ManaPotion();
        somePowerPotion = new PowerPotion();

        storeList.add(someHealthPotion);
        storeList.add(someManaPotion);
        storeList.add(somePowerPotion);
    }

    @Override
    public List<Item> setStoreListData() {
        return this.storeList;
    }
}
