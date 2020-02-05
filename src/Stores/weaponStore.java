package Stores;

import java.util.List;
import java.util.ArrayList;
import Items.Item;
import Items.weaponStore.Crossbow;
import Items.weaponStore.Sword;
import Items.weaponStore.Axe;

public class weaponStore extends Store {

    private Crossbow someCrossbow;
    private Sword someSword;
    private Axe someAxe;

    private List <Item> storeList = new ArrayList();

    public int getCrossbowPrice() {
        return someCrossbow.getPrice();
    }

    public int getSwordPrice() {
        return someSword.getPrice();
    }

    public int getAxePrice() {
        return someAxe.getPrice();
    }

    public void addFirstItemToStore() {
        someCrossbow = new Crossbow();
        storeList.add(someCrossbow);
    }

    public void addSecondItemToStore() {
        someSword = new Sword();
        storeList.add(someSword);
    }

    public void addThirdItemToStore() {
        someAxe = new Axe();
        storeList.add(someAxe);
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
