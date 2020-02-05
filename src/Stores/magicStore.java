package Stores;

import java.util.List;
import java.util.ArrayList;
import Items.Item;
import Items.magicStore.Staff;
import Items.magicStore.Amulet;
import Items.magicStore.Powder;

public class magicStore extends Store {

    private Staff someStaff;
    private Amulet someAmulet;
    private Powder somePowder;

    private List <Item> storeList = new ArrayList();

    public int getStaffPrice() {
        return someStaff.getPrice();
    }

    public int getAmuletPrice() {
        return someAmulet.getPrice();
    }

    public int getPowderPrice() {
        return somePowder.getPrice();
    }

    public void addFirstItemToStore() {
        someStaff = new Staff();
        storeList.add(someStaff);
    }

    public void addSecondItemToStore() {
        someAmulet = new Amulet();
        storeList.add(someAmulet);
    }

    public void addThirdItemToStore() {
        somePowder = new Powder();
        storeList.add(somePowder);
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
