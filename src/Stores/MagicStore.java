package Stores;

import java.util.List;
import java.util.ArrayList;
import Items.Item;
import Items.magicStore.Staff;
import Items.magicStore.Amulet;
import Items.magicStore.Powder;

public class MagicStore extends Store {

    private Staff someStaff;
    private Amulet someAmulet;
    private Powder somePowder;

    private List <Item> storeList = new ArrayList();

    public MagicStore() {
        someStaff = new Staff();
        someAmulet = new Amulet();
        somePowder = new Powder();

        storeList.add(someStaff);
        storeList.add(someAmulet);
        storeList.add(somePowder);
    }

    public int getStaffPrice() {
        return someStaff.getPrice();
    }

    public int getAmuletPrice() {
        return someAmulet.getPrice();
    }

    public int getPowderPrice() {
        return somePowder.getPrice();
    }

    @Override
    public List<Item> setListData() {
        return this.storeList;
    }
}
