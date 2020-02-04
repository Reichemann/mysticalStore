package Stores;

import java.util.ArrayList;
import java.util.List;
import Items.Item;

public class armorStore extends Store {

    private List <Item> storeList = new ArrayList();

    public armorStore(List <Item> storeList) {
        super(storeList);
    }

    @Override
    public List<Item> getStoreList() {
        return this.storeList;
    }

    @Override
    public void setStoreList(List<Item> storeList) {
        this.storeList = storeList;
    }
}
