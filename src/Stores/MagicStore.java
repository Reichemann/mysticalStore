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

    private List<Item> storeList = new ArrayList<>();

    public MagicStore() {
        someStaff = new Staff();
        someAmulet = new Amulet();
        somePowder = new Powder();

        storeList.add(someStaff);
        storeList.add(someAmulet);
        storeList.add(somePowder);
    }

    @Override
    public List<Item> setStoreListData() {
        return this.storeList;
    }
}
