package app;

import java.util.*;

import app.model.store.*;

public class Main {

    private static final Scanner in = new Scanner(System.in);

    private static final List<Integer> priceList = new ArrayList<>();

    private static final ArmorStore someArmorStore = new ArmorStore();
    private static final MagicStore someMagicStore = new MagicStore();
    private static final WeaponStore someWeaponStore = new WeaponStore();
    private static final AlchemyStore someAlchemyStore = new AlchemyStore();

    private static boolean play = true;

    public static void main(String[] args) {

        System.out.println("Welcome to the great shopping! Choose an option: ");

        while (play)
            printMainData();
    }

    private static void printMainData() {

        System.out.println("1. Armor Store.");
        System.out.println("2. Magic Store.");
        System.out.println("3. Weapon Store.");
        System.out.println("4. Alchemy Store.");
        System.out.println("5. Show total purchase price.");
        System.out.println("6. Exit.");

        int userMainChoice = in.nextInt();

        int totalPurchasePrice = 0;

        switch (userMainChoice) {

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

    private static void someStoreData(Store someStore) {

        for (int i = 0; i < someStore.setStoreListData().size(); ++i)
            System.out.println((i + 1) + ". " + someStore.setStoreListData().get(i).getName());

        int someStoreChoice = in.nextInt();

        if (someStoreChoice < 0 || someStoreChoice > someStore.setStoreListData().size())
            errorMessage();
        else {
            purchaseMessage();
            addPurchaseToPriceList(someStore.setStoreListData().get(someStoreChoice - 1).getPrice());
        }
    }

    private static void addPurchaseToPriceList(int price) {
        priceList.add(price);
    }

    private static int getTotalPurchasePrice(int totalPurchasePrice) {

        for (int object : priceList)
            totalPurchasePrice += object;

        return totalPurchasePrice;
    }

    private static void showTotalPurchasePrice(int totalPurchasePrice) {

        if (totalPurchasePrice != 0)
            System.out.println("Total purchase price: " + totalPurchasePrice);
        else
            System.out.println("Buy something, you`ll not regret it!");
    }

    private static boolean programEnd() {
        System.out.println("Good luck!");
        return false;
    }

    private static void purchaseMessage() {
        System.out.println("Purchase completed!");
    }

    private static void errorMessage() {
        System.out.println("Incorrect input!");
    }
}