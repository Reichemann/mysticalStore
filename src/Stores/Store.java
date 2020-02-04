package Stores;

import java.util.List;
import java.util.ArrayList;
import Items.Item;

public abstract class Store {

    private List <Item> storeList = new ArrayList();

    public Store(List <Item> storeList) {
        this.storeList = storeList;
    }

    public List <Item> getStoreList() {
        return this.storeList;
    }

    public void setStoreList(List <Item> storeList) {
        this.storeList = storeList;
    }
}