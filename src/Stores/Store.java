package Stores;

import java.util.List;
import Items.Item;

public abstract class Store {
    private Item firstItem;
    private Item secondItem;
    private Item thirdItem;

    private List <Item> storeList = setStoreListData();
    protected abstract List <Item> setStoreListData();

    public List<Item> getStoreList() {
        return this.storeList;
    }

    public String getFirstItemName() {
        return firstItem.getName();
    }

    public String getSecondItemName() {
        return secondItem.getName();
    }

    public String getThirdItemName() {
        return thirdItem.getName();
    }

    public Integer getFirstItemPrice() {
        return firstItem.getPrice();
    }

    public Integer getSecondItemPrice() {
        return secondItem.getPrice();
    }

    public Integer getThirdItemPrice() {
        return thirdItem.getPrice();
    }
}
