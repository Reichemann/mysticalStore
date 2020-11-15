package app.model.store;

import java.util.*;

import app.model.item.armor.*;
import app.model.item.Item;

public class ArmorStore extends Store {

    private final List<Item> storeList = new ArrayList<>();

    public ArmorStore() {
        storeList.add(new Helmet());
        storeList.add(new Armor());
        storeList.add(new Leggings());
    }

    @Override
    public List<Item> setStoreListData() {
        return this.storeList;
    }
}