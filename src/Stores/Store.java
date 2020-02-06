package Stores;

import java.util.List;
import Items.Item;

public abstract class Store {
    private List <Item> storeList = setStoreListData();
    protected abstract List <Item> setStoreListData();

    public List<Item> getStoreList() {
        return this.storeList;
    }
}
