import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;

import Items.Item;
import Stores.armorStore;
import Stores.magicStore;
import Stores.weaponStore;
import Stores.alchemyStore;
import Items.armorStore.Armor;
import Items.armorStore.Helmet;
import Items.armorStore.Leggings;
import Items.magicStore.Staff;
import Items.magicStore.Amulet;
import Items.magicStore.Powder;
import Items.weaponStore.Crossbow;
import Items.weaponStore.Sword;
import Items.weaponStore.Axe;
import Items.alchemyStore.healthPotion;
import Items.alchemyStore.manaPotion;
import Items.alchemyStore.powerPotion;

public class main {

    static armorStore someArmorStore;
    static magicStore someMagicStore;
    static weaponStore someWeaponStore;
    static alchemyStore someAlchemyStore;

    static Helmet someHelmet = new Helmet();
    static Armor someArmor = new Armor();
    static Leggings someLeggings = new Leggings();
    static Staff someStaff = new Staff();
    static Amulet someAmulet = new Amulet();
    static Powder somePowder = new Powder();
    static Crossbow someCrossbow = new Crossbow();
    static Sword someSword = new Sword();
    static Axe someAxe = new Axe();
    static healthPotion someHealthPotion = new healthPotion();
    static manaPotion someManaPotion = new manaPotion();
    static powerPotion somePowerPotion = new powerPotion();
    static List <Item> armorStoreList = new ArrayList<>();
    static List <Item> magicStoreList = new ArrayList<>();
    static List <Item> weaponStoreList = new ArrayList<>();
    static List <Item> alchemyStoreList = new ArrayList<>();

    static List <Integer> priceList = new ArrayList<>();
    static int totalPurchasePrice = 0;
    static boolean play = true;

    static Scanner in = new Scanner(System.in);

    public static void main(String[] args) {

        addHelmetToArmorStore(armorStoreList, someHelmet);
        addArmorToArmorStore(armorStoreList, someArmor);
        addLeggingsToArmorStore(armorStoreList, someLeggings);
        addStaffToMagicStore(magicStoreList, someStaff);
        addAmuletToMagicStore(magicStoreList, someAmulet);
        addPowderToMagicStore(magicStoreList, somePowder);
        addCrossbowToWeaponStore(weaponStoreList, someCrossbow);
        addAxeToWeaponStore(weaponStoreList, someAxe);
        addHealthPotionToAlchemyStore(alchemyStoreList, someHealthPotion);
        addManaPotionToAlchemyStore(alchemyStoreList, someManaPotion);
        addPowerPotionToAlchemyStore(alchemyStoreList, somePowerPotion);

        someArmorStore = new armorStore(armorStoreList);
        someMagicStore = new magicStore(magicStoreList);
        someWeaponStore = new weaponStore(weaponStoreList);
        someAlchemyStore = new alchemyStore(alchemyStoreList);

        System.out.println("Welcome to the great shopping! Choose a store: ");

        while(play) {
            printMainData();
        }
    }

    public static void printMainData() {
        System.out.println("1. Armor Store.");
        System.out.println("2. Magic Store.");
        System.out.println("3. Weapon Store.");
        System.out.println("4. Alchemy Store.");
        System.out.println("5. Show total purchase price.");
        System.out.println("6. Exit.");

        int userMainChoice = in.nextInt();

        switch(userMainChoice) {
            case 1:
                armorStoreData();
                break;
            case 2:
                magicStoreData();
                break;
            case 3:
                weaponStoreData();
                break;
            case 4:
                alchemyStoreData();
                break;
            case 5:
                showTotalPurchasePrice(getTotalPurchasePrice(totalPurchasePrice));
                break;
            case 6:
                play = programEnd();
                break;
            default:
                errorMessage();
                break;
        }
    }

    public static void armorStoreData() {
        System.out.println("1. Steel Helmet.");
        System.out.println("2. Steel Armor.");
        System.out.println("3. Steel Leggings.");

        int armorStoreChoice = in.nextInt();

        switch(armorStoreChoice) {
            case 1:
                purchaseMessage();
                addPurchaseToPriceList(someHelmet.getPrice(), priceList);
                break;
            case 2:
                purchaseMessage();
                addPurchaseToPriceList(someArmor.getPrice(), priceList);
                break;
            case 3:
                purchaseMessage();
                addPurchaseToPriceList(someLeggings.getPrice(), priceList);
                break;
            default:
                errorMessage();
                break;
        }
    }

    public static void addHelmetToArmorStore(List <Item> armorStoreList, Helmet helmet) {
        helmet = new Helmet();
        armorStoreList.add(helmet);
    }

    public static void addArmorToArmorStore(List <Item> armorStoreList, Armor armor) {
        armor = new Armor();
        armorStoreList.add(armor);
    }

    public static void addLeggingsToArmorStore(List <Item> armorStoreList, Leggings leggings) {
        leggings = new Leggings();
        armorStoreList.add(leggings);
    }

    public static void magicStoreData() {
        System.out.println("1. Arcane staff.");
        System.out.println("2. Mystical amulet.");
        System.out.println("3. Magic powder.");

        int magicStoreChoice = in.nextInt();

        switch(magicStoreChoice) {
            case 1:
                purchaseMessage();
                addPurchaseToPriceList(someStaff.getPrice(), priceList);
                break;
            case 2:
                purchaseMessage();
                addPurchaseToPriceList(someAmulet.getPrice(), priceList);
                break;
            case 3:
                purchaseMessage();
                addPurchaseToPriceList(somePowder.getPrice(), priceList);
                break;
            default:
                errorMessage();
                break;
        }
    }

    public static void addStaffToMagicStore(List <Item> magicStoreList, Staff staff) {
        staff = new Staff();
        magicStoreList.add(staff);
    }

    public static void addAmuletToMagicStore(List <Item> magicStoreList, Amulet amulet) {
        amulet = new Amulet();
        magicStoreList.add(amulet);
    }

    public static void addPowderToMagicStore(List <Item> magicStoreList, Powder powder) {
        powder = new Powder();
        magicStoreList.add(powder);
    }

    public static void weaponStoreData() {
        System.out.println("1. Powerful crossbow.");
        System.out.println("2. Steel sword.");
        System.out.println("3. Mithril axe.");

        int weaponStoreChoice = in.nextInt();

        switch(weaponStoreChoice) {
            case 1:
                purchaseMessage();
                addPurchaseToPriceList(someCrossbow.getPrice(), priceList);
                break;
            case 2:
                purchaseMessage();
                addPurchaseToPriceList(someSword.getPrice(), priceList);
                break;
            case 3:
                purchaseMessage();
                addPurchaseToPriceList(someAxe.getPrice(), priceList);
                break;
            default:
                errorMessage();
                break;
        }
    }

    public static void addCrossbowToWeaponStore(List <Item> weaponStoreList, Crossbow crossbow) {
        crossbow = new Crossbow();
        weaponStoreList.add(crossbow);
    }

    public static void addSwordToWeaponStore(List <Item> weaponStoreList, Sword sword) {
        sword = new Sword();
        weaponStoreList.add(sword);
    }

    public static void addAxeToWeaponStore(List <Item> weaponStoreList, Axe axe) {
        axe = new Axe();
        weaponStoreList.add(axe);
    }

    public static void alchemyStoreData() {
        System.out.println("1. Health potion.");
        System.out.println("2. Mana potion.");
        System.out.println("3. Power potion.");

        int alchemyStoreChoice = in.nextInt();

        switch(alchemyStoreChoice) {
            case 1:
                purchaseMessage();
                addPurchaseToPriceList(someHealthPotion.getPrice(), priceList);
                break;
            case 2:
                purchaseMessage();
                addPurchaseToPriceList(someManaPotion.getPrice(), priceList);
                break;
            case 3:
                purchaseMessage();
                addPurchaseToPriceList(somePowerPotion.getPrice(), priceList);
                break;
            default:
                errorMessage();
                break;
        }
    }

    public static void addHealthPotionToAlchemyStore(List <Item> alchemyStoreList, healthPotion healthpotion) {
        healthpotion = new healthPotion();
        alchemyStoreList.add(healthpotion);
    }

    public static void addManaPotionToAlchemyStore(List <Item> alchemyStoreList, manaPotion manapotion) {
        manapotion = new manaPotion();
        alchemyStoreList.add(manapotion);
    }

    public static void addPowerPotionToAlchemyStore(List <Item> alchemyStoreList, powerPotion powerpotion) {
        powerpotion = new powerPotion();
        alchemyStoreList.add(powerpotion);
    }

    public static void addPurchaseToPriceList(int price, List <Integer> priceList) {
        priceList.add(price);
    }

    public static int getTotalPurchasePrice(int totalPurchasePrice) {

        for(int object : priceList) {
            totalPurchasePrice += object;
        }

        return totalPurchasePrice;
    }

    public static void showTotalPurchasePrice(int totalPurchasePrice) {
        if(totalPurchasePrice != 0)
            System.out.println("Total purchase price: " + totalPurchasePrice);
        else
            System.out.println("Buy something, you`ll not regret it!");
    }

    public static boolean programEnd() {
        System.out.println("Good luck!");

        return false;
    }

    public static void purchaseMessage() {
        System.out.println("Purchase completed!");
    }

    public static void errorMessage() {
        System.out.println("Incorrect input! Please, restart the program.");
    }
}
