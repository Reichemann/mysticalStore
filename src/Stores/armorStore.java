package Stores;

import java.util.ArrayList;
import java.util.List;
import Items.Item;
import Items.armorStore.Helmet;
import Items.armorStore.Armor;
import Items.armorStore.Leggings;


public class armorStore extends Store {

    private Helmet someHelmet;
    private Armor someArmor;
    private Leggings someLeggings;

    private List<Item> storeList = new ArrayList();

    public int getHelmetPrice() {
        return someHelmet.getPrice();
    }

    public int getArmorPrice() {
        return someArmor.getPrice();
    }

    public int getLeggingsPrice() {
        return someLeggings.getPrice();
    }

    public void addFirstItemToStore() {
        someHelmet = new Helmet();
        storeList.add(someHelmet);
    }

    public void addSecondItemToStore() {
        someArmor = new Armor();
        storeList.add(someArmor);
    }

    public void addThirdItemToStore() {
        someLeggings = new Leggings();
        storeList.add(someLeggings);
    }

    @Override
    public List<Item> getStoreList() {
        return storeList;
    }

    @Override
    public void setStoreList(List<Item> storeList) {
        this.storeList = storeList;
    }
}
