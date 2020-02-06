import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;

import Stores.ArmorStore;
import Stores.MagicStore;
import Stores.WeaponStore;
import Stores.AlchemyStore;

public class Main {

    static ArmorStore someArmorStore = new ArmorStore();
    static MagicStore someMagicStore = new MagicStore();
    static WeaponStore someWeaponStore = new WeaponStore();
    static AlchemyStore someAlchemyStore = new AlchemyStore();

    static List <Integer> priceList = new ArrayList<>();
    static int totalPurchasePrice = 0;
    static boolean play = true;

    static Scanner in = new Scanner(System.in);

    public static void main(String[] args) {

        System.out.println("Welcome to the great shopping! Choose an option: ");

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
                addPurchaseToPriceList(someArmorStore.getHelmetPrice(), priceList);
                break;
            case 2:
                purchaseMessage();
                addPurchaseToPriceList(someArmorStore.getArmorPrice(), priceList);
                break;
            case 3:
                purchaseMessage();
                addPurchaseToPriceList(someArmorStore.getLeggingsPrice(), priceList);
                break;
            default:
                errorMessage();
                break;
        }
    }

    public static void magicStoreData() {
        System.out.println("1. Arcane staff.");
        System.out.println("2. Mystical amulet.");
        System.out.println("3. Magic powder.");

        int magicStoreChoice = in.nextInt();

        switch(magicStoreChoice) {
            case 1:
                purchaseMessage();
                addPurchaseToPriceList(someMagicStore.getStaffPrice(), priceList);
                break;
            case 2:
                purchaseMessage();
                addPurchaseToPriceList(someMagicStore.getAmuletPrice(), priceList);
                break;
            case 3:
                purchaseMessage();
                addPurchaseToPriceList(someMagicStore.getPowderPrice(), priceList);
                break;
            default:
                errorMessage();
                break;
        }
    }

    public static void weaponStoreData() {
        System.out.println("1. Powerful crossbow.");
        System.out.println("2. Steel sword.");
        System.out.println("3. Mithril axe.");

        int weaponStoreChoice = in.nextInt();

        switch(weaponStoreChoice) {
            case 1:
                purchaseMessage();
                addPurchaseToPriceList(someWeaponStore.getCrossbowPrice(), priceList);
                break;
            case 2:
                purchaseMessage();
                addPurchaseToPriceList(someWeaponStore.getSwordPrice(), priceList);
                break;
            case 3:
                purchaseMessage();
                addPurchaseToPriceList(someWeaponStore.getAxePrice(), priceList);
                break;
            default:
                errorMessage();
                break;
        }
    }

    public static void alchemyStoreData() {
        System.out.println("1. Health potion.");
        System.out.println("2. Mana potion.");
        System.out.println("3. Power potion.");

        int alchemyStoreChoice = in.nextInt();

        switch(alchemyStoreChoice) {
            case 1:
                purchaseMessage();
                addPurchaseToPriceList(someAlchemyStore.getHealthPotionPrice(), priceList);
                break;
            case 2:
                purchaseMessage();
                addPurchaseToPriceList(someAlchemyStore.getManaPotionPrice(), priceList);
                break;
            case 3:
                purchaseMessage();
                addPurchaseToPriceList(someAlchemyStore.getPowerPotionPrice(), priceList);
                break;
            default:
                errorMessage();
                break;
        }
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
