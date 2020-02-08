package Stores;

import java.util.ArrayList;
import java.util.List;
import Items.Item;
import Items.armorStore.Helmet;
import Items.armorStore.Armor;
import Items.armorStore.Leggings;

public class ArmorStore extends Store {

    private Helmet someHelmet;
    private Armor someArmor;
    private Leggings someLeggings;

    private List<Item> storeList = new ArrayList<>();

    public ArmorStore() {
        someHelmet = new Helmet();
        someArmor = new Armor();
        someLeggings = new Leggings();

        storeList.add(someHelmet);
        storeList.add(someArmor);
        storeList.add(someLeggings);
    }

    @Override
    public List<Item> setStoreListData() {
        return this.storeList;
    }
}
