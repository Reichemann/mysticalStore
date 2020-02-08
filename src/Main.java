import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;

import Stores.Store;
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
                someStoreData(someArmorStore);
                break;
            case 2:
                someStoreData(someMagicStore);
                break;
            case 3:
                someStoreData(someWeaponStore);
                break;
            case 4:
                someStoreData(someAlchemyStore);
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

    public static void someStoreData(Store someStore) {

        for(int i = 0; i < someStore.setStoreListData().size(); ++i) {
            System.out.println((i + 1) + ". " + someStore.setStoreListData().get(i).getName());
        }

        int someStoreChoice = in.nextInt();

        if(someStoreChoice < 0 || someStoreChoice > someStore.setStoreListData().size()) {
            errorMessage();
        }

        else {
            purchaseMessage();
            addPurchaseToPriceList(someStore.setStoreListData().get(someStoreChoice - 1).getPrice());
        }
    }

    public static void addPurchaseToPriceList(int price) {
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
        System.out.println("Incorrect input!");
    }
}