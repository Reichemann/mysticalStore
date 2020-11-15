package app.model.store;

import java.util.*;

import app.model.item.weapon.*;
import app.model.item.Item;

public class WeaponStore extends Store {

    private final List<Item> storeList = new ArrayList<>();

    public WeaponStore() {
        storeList.add(new Crossbow());
        storeList.add(new Sword());
        storeList.add(new Axe());
    }

    @Override
    public List<Item> setStoreListData() {
        return this.storeList;
    }
}