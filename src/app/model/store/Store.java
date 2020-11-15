package app.model.store;

import java.util.List;

import app.model.item.Item;

public abstract class Store {

    private final List<Item> storeList = setStoreListData();

    public List<Item> setStoreListData() {
        return storeList;
    }
}