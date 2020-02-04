package Stores;

import java.util.List;
import java.util.ArrayList;
import Items.Item;

public class weaponStore extends Store {

    private List <Item> storeList = new ArrayList();

    public weaponStore(List <Item> storeList) {
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
