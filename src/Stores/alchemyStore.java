package Stores;

import java.util.List;
import java.util.ArrayList;
import Items.Item;
import Items.alchemyStore.healthPotion;
import Items.alchemyStore.manaPotion;
import Items.alchemyStore.powerPotion;

public class alchemyStore extends Store {

    private healthPotion someHealthPotion;
    private manaPotion someManaPotion;
    private powerPotion somePowerPotion;

    private List <Item> storeList = new ArrayList();

    public int getHealthPotionPrice() {
        return someHealthPotion.getPrice();
    }

    public int getManaPotionPrice() {
        return someManaPotion.getPrice();
    }

    public int getPowerPotionPrice() {
        return somePowerPotion.getPrice();
    }

    public void addFirstItemToStore() {
        someHealthPotion = new healthPotion();
        storeList.add(someHealthPotion);
    }

    public void addSecondItemToStore() {
        someManaPotion = new manaPotion();
        storeList.add(someManaPotion);
    }

    public void addThirdItemToStore() {
        somePowerPotion = new powerPotion();
        storeList.add(somePowerPotion);
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
