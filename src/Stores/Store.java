package Stores;

import java.util.List;
import Items.Item;

public abstract class Store {
    private List <Item> storeList = setListData();
    public abstract List <Item> setListData();
}
