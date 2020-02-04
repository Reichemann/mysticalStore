import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;
import Stores.armorStore;
import Stores.magicStore;
import Stores.weaponStore;

public class main {

    static armorStore someArmorStore = new armorStore();
    static magicStore someMagicStore = new magicStore();
    static weaponStore someWeaponShop = new weaponStore();
    static List <Integer> priceList = new ArrayList<>();
    static int totalPurchasePrice = 0;
    static boolean play = true;

    static Scanner in = new Scanner(System.in);

    public static void main(String[] args) {

        System.out.println("Welcome to the great shopping! Choose a store: ");

        while(play) {
            printMainData();
        }
    }

    public static void printMainData() {
        System.out.println("1. Armor Store.");
        System.out.println("2. Magic Store.");
        System.out.println("3. Weapon Store.");
        System.out.println("4. Show total purchase price.");
        System.out.println("5. Exit.");

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
                showTotalPurchasePrice(getTotalPurchasePrice(totalPurchasePrice));
                break;
            case 5:
                programEnd(play);
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
                priceList.add(someArmorStore.getHelmetPrice());
                break;
            case 2:
                purchaseMessage();
                priceList.add(someArmorStore.getArmorPrice());
                break;
            case 3:
                purchaseMessage();
                priceList.add(someArmorStore.getLeggingsPrice());
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
                priceList.add(someMagicStore.getMagicStaffPrice());
                break;
            case 2:
                purchaseMessage();
                priceList.add(someMagicStore.getMagicAmuletPrice());
                break;
            case 3:
                purchaseMessage();
                priceList.add(someMagicStore.getMagicPowderPrice());
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
                priceList.add(someWeaponShop.getCrossbowPrice());
                break;
            case 2:
                purchaseMessage();
                priceList.add(someWeaponShop.getSwordPrice());
                break;
            case 3:
                purchaseMessage();
                priceList.add(someWeaponShop.getAxePrice());
                break;
            default:
                errorMessage();
                break;
        }
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

    public static void programEnd(boolean value) {
        System.out.println("Good luck!");
        value = false;
    }

    public static void purchaseMessage() {
        System.out.println("Purchase completed!");
    }

    public static void errorMessage() {
        System.out.println("Incorrect input! Please, restart the program.");
    }
}
