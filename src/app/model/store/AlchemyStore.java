package app.model.store;

import java.util.*;

import app.model.item.alchemy.*;
import app.model.item.Item;

public class AlchemyStore extends Store {

    private final List<Item> storeList = new ArrayList<>();

    public AlchemyStore() {
        storeList.add(new HealthPotion());
        storeList.add(new ManaPotion());
        storeList.add(new PowerPotion());
    }

    @Override
    public List<Item> setStoreListData() {
        return this.storeList;
    }
}