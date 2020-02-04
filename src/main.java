import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;
import Stores.armorStore;
import Stores.magicStore;
import Stores.weaponStore;
import Stores.alchemyStore;

public class main {

    static armorStore someArmorStore = new armorStore();
    static magicStore someMagicStore = new magicStore();
    static weaponStore someWeaponStore = new weaponStore();
    static alchemyStore someAlchemyStore = new alchemyStore();
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
                priceList.add(someWeaponStore.getCrossbowPrice());
                break;
            case 2:
                purchaseMessage();
                priceList.add(someWeaponStore.getSwordPrice());
                break;
            case 3:
                purchaseMessage();
                priceList.add(someWeaponStore.getAxePrice());
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
                priceList.add(someAlchemyStore.getHealthPotion());
                break;
            case 2:
                purchaseMessage();
                priceList.add(someAlchemyStore.getManaPotion());
                break;
            case 3:
                purchaseMessage();
                priceList.add(someAlchemyStore.getPowerPotion());
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
