package app.model.store;

import java.util.*;

import app.model.item.magic.*;
import app.model.item.Item;

public class MagicStore extends Store {

    private final List<Item> storeList = new ArrayList<>();

    public MagicStore() {
        storeList.add(new Staff());
        storeList.add(new Amulet());
        storeList.add(new Powder());
    }

    @Override
    public List<Item> setStoreListData() {
        return this.storeList;
    }
}