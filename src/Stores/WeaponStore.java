package Stores;

import java.util.List;
import java.util.ArrayList;
import Items.Item;
import Items.weaponStore.Crossbow;
import Items.weaponStore.Sword;
import Items.weaponStore.Axe;

public class WeaponStore extends Store {

    private Crossbow someCrossbow;
    private Sword someSword;
    private Axe someAxe;

    private List<Item> storeList = new ArrayList<>();

    public WeaponStore() {
        someCrossbow = new Crossbow();
        someSword = new Sword();
        someAxe = new Axe();

        storeList.add(someCrossbow);
        storeList.add(someSword);
        storeList.add(someAxe);
    }

    @Override
    public List<Item> setStoreListData() {
        return this.storeList;
    }
}
