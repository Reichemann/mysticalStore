package Stores;

import java.util.List;
import Items.Item;

public abstract class Store {

    private List<Item> storeList = setStoreListData();

    public List<Item> setStoreListData() {
        return storeList;
    }
}
